package com.leetcode.search;
//
//Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
//
//Your algorithm's runtime complexity must be in the order of O(log n).
//
//If the target is not found in the array, return [-1, -1]

public class FindFirstAndLastPositionOfElementInSortedArray34 {

    public int[] searchRange(int[] nums, int target) {
        int [] result = {-1,-1};
        if(nums == null) {
          return result;
        }   
        
        result[0] = getFirstOccurence(nums,target);
        result[1] = getlastFirstOccurence(nums,target);
        
        return result;
    }
    public int getFirstOccurence(int[] nums, int target){
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
    
     public int getlastFirstOccurence(int[] nums, int target){
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
