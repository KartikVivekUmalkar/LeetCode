package com.leetcode.array;

//Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
//
//Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
//
//Note: You are not suppose to use the library's sort function for this problem.
public class SortColors75 {
	public void sortColors(int[] nums) {
		int start = 0;
		int current = 0;
		int end = nums.length - 1;

		while (current <= end) {
			if (nums[current] == 0) {
				swap(nums, start++, current++);
			} else if (nums[current] == 2) {
				swap(nums, current, end--);
			} else if (nums[current] == 1) {
				current++;
			}
		}
	}

	public void swap(int[] nums, int indexOfElement1, int indexofElement2) {

		int temp = nums[indexOfElement1];
		nums[indexOfElement1] = nums[indexofElement2];
		nums[indexofElement2] = temp;
	}
}
