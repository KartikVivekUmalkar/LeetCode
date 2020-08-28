package com.leetcode.array;

import java.util.HashSet;

public class HappyNumber202 {
	public boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<>();
		if (n == 1) {
			return true;
		}
		while (!set.contains(n) && n != 1) {
			set.add(n);
			int sum = 0;
			while (n > 0) {
				int lastDigit = n % 10;
				sum += lastDigit * lastDigit;
				n /= 10;
			}
			if (sum == 1) {
				return true;
			} else {

				n = sum;
			}
		}

		return false;
	}
}
