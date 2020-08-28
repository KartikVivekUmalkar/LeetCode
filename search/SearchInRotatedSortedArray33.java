package com.leetcode.search;
//Given an integer array nums sorted in ascending order, and an integer target.

//
//Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
//
//You should search for target in nums and if you found return its index, otherwise return -1.

public class SearchInRotatedSortedArray33 {
	public int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[start] <= nums[mid]) {
				if (nums[start] <= target && nums[mid] >= target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (nums[mid] <= target && nums[end] >= target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}
}
