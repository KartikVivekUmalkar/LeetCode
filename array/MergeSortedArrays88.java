package com.leetcode.array;

//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//
//Note:
//
//The number of elements initialized in nums1 and nums2 are m and n respectively.
//You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
import java.util.PriorityQueue;

public class MergeSortedArrays88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < m; i++) {
			queue.add(nums1[i]);
		}

		for (int i = 0; i < n; i++) {
			queue.add(nums2[i]);
		}

		int counter = 0;
		while (!queue.isEmpty()) {
			nums1[counter++] = queue.poll();
		}
	}

}
