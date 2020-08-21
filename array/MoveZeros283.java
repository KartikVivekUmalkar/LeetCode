package com.leetcode.array;

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements
public class MoveZeros283 {
	public void moveZeroes(int[] nums) {
		int count = 0;
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[counter++] = nums[i];
			}
		}
		for (int i = counter; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

}
