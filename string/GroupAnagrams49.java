package com.leetcode.string;
//Given an array of strings, group anagrams together.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> resultList = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < strs.length; i++) {
			char[] elementsArray = strs[i].toCharArray();
			Arrays.sort(elementsArray);
			String sortedString = new String(elementsArray);
			if (map.containsKey(sortedString)) {
				List<String> anagramList = map.get(sortedString);
				anagramList.add(strs[i]);
				map.put(sortedString, anagramList);
			} else {
				ArrayList<String> anagramList = new ArrayList<>();
				anagramList.add(strs[i]);
				map.put(sortedString, anagramList);
			}
		}

		for (String sortedString : map.keySet()) {
			List<String> anagramList = map.get(sortedString);
			resultList.add(anagramList);
		}
		return resultList;
	}
}
