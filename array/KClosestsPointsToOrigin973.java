package com.leetcode.array;

import java.util.Arrays;

public class KClosestsPointsToOrigin973 {
	public int[][] kClosest(int[][] points, int K) {
		int[][] result = new int[K][2];
		Arrays.sort(points, (a, b) -> {
			int xCordinateOFA = a[0];
			int yCordinateOFA = a[1];
			int xCordinateOFB = b[0];
			int yCordinateOFB = b[1];
			double distanceOfAFromOrigin = Math.sqrt(Math.pow(xCordinateOFA, 2) + Math.pow(yCordinateOFA, 2));
			double distanceOfBFromOrigin = Math.sqrt(Math.pow(xCordinateOFB, 2) + Math.pow(yCordinateOFB, 2));

			return (int) (distanceOfAFromOrigin - distanceOfBFromOrigin);
		});
		return result;
	}
}
