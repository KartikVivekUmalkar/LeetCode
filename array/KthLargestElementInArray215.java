package com.leetcode.array;

//Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

import java.util.PriorityQueue;

public class KthLargestElementInArray215 {
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
			return b - a;
		});
		for (int i = 0; i < nums.length; i++) {
			queue.add(nums[i]);
		}
		int counter = 0;
		while (!queue.isEmpty() && counter < k - 1) {
			queue.poll();
			counter++;
		}
		return queue.poll();
	}
}
