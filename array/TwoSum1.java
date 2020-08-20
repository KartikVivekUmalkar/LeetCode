package com.leetcode.array;

import java.util.HashMap;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

public class TwoSum1 {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i]) && (target - nums[i] == nums[i])) {
				result[0] = map.get(nums[i]);
				result[1] = i;
				return result;
			} else {
				map.put(nums[i], i);
			}

		}

		for (int key : map.keySet()) {
			if (map.containsKey(target - key)) {
				result[0] = map.get(key);
				result[1] = map.get(target - key);
				break;
			}
		}
		return result;

	}

}
