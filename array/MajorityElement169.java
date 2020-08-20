package com.leetcode.array;

//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

//
//You may assume that the array is non-empty and the majority element always exist in the array.


import java.util.HashMap;

public class MajorityElement169 {
	public int majorityElement(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int element = Integer.MIN_VALUE;
		int frequency = 0;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}

		for (Integer i : map.keySet()) {
			if (map.get(i) > frequency) {
				frequency = map.get(i);
				element = i;
			}
		}
		if (map.get(element) > nums.length / 2) {
			return element;
		}
		return Integer.MIN_VALUE;
	}
}
