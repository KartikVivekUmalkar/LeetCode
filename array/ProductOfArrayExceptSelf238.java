package com.leetcode.array;

//Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
public class ProductOfArrayExceptSelf238 {
	public int[] productExceptSelf(int[] nums) {
		int[] productOfElementsToLeft = new int[nums.length];
		int[] productOfElementsToRight = new int[nums.length];
		int[] result = new int[nums.length];

		productOfElementsToLeft[0] = 1;
		productOfElementsToRight[nums.length - 1] = 1;

		for (int i = 1; i < nums.length; i++) {

			productOfElementsToLeft[i] = productOfElementsToLeft[i - 1] * nums[i - 1];
		}

		for (int i = nums.length - 2; i >= 0; i--) {

			productOfElementsToRight[i] = productOfElementsToRight[i + 1] * nums[i + 1];

		}

		for (int i = 0; i < nums.length; i++) {

			result[i] = productOfElementsToLeft[i] * productOfElementsToRight[i];
		}

		return result;
	}
}
