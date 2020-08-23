package com.leetcode.string;

//Given two strings s and t , write a function to determine if t is an anagram of s.
import java.util.Arrays;

public class ValidAnagram242 {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		char[] arrayS = s.toCharArray();
		char[] arrayT = t.toCharArray();
		Arrays.sort(arrayS);
		Arrays.sort(arrayT);
		String sortedS = new String(arrayS);
		String sortedT = new String(arrayT);
		if (sortedS.compareTo(sortedT) != 0) {
			return false;
		}
		return true;
	}

}
