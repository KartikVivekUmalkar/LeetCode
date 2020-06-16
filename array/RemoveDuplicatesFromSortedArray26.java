package com.leetcode.array;

//Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
public class RemoveDuplicatesFromSortedArray26 {

	public int removeDuplicates(int[] nums) {
		int count = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				continue;
			else {
				nums[count++] = nums[i + 1];

			}
		}
		return count;
	}

}
