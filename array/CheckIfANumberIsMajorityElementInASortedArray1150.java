package com.leetcode.array;

//Given an array nums sorted in non-decreasing order, and a number target, return True if and only if target is a majority element.
//
//A majority element is an element that appears more than N/2 times in an array of length N.



public class CheckIfANumberIsMajorityElementInASortedArray1150 {

	public boolean isMajorityElement(int[] nums, int target) {

		int first = getFirstOccurence(nums, target);
		int last = getLastOccurence(nums, target);

		if (last != -1 && first != -1 && (last - first + 1) > nums.length / 2) {
			return true;
		}

		return false;

	}

	int getFirstOccurence(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int index = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				index = mid;
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else
				end = mid - 1;
		}
		return index;
	}

	int getLastOccurence(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int index = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				index = mid;
				start = mid + 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else
				end = mid - 1;
		}
		return index;
	}

}
