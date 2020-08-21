package com.leetcode.recurssion;

import java.util.Arrays;

public class ClimbingStairs70 {
	public int climbStairs(int n) {
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		memo[0] = 0;
		memo[1] = 1;
		memo[2] = 2;
		stepsTaken(n, memo);

		return memo[n];

	}

	public int stepsTaken(int n, int[] memo) {
		if (memo[n] != -1) {
			return memo[n];
		} else {
			return memo[n] = stepsTaken(n - 1, memo) + stepsTaken(n - 2, memo);
		}
	}

}
