
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.
package com.leetcode.stack;

import java.util.Stack;

public class ValidParanthesis20 {
	public boolean isValid(String s) {
		if (s.length() == 0 || s.isEmpty())
			return true;
		if (s.length() == 1)
			return false;
		Stack<Character> stack = new Stack();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ']') {
				stack.add('[');
			} else if (s.charAt(i) == ')') {
				stack.add('(');
			} else if (s.charAt(i) == '}') {
				stack.add('{');
			} else if (!stack.isEmpty() && s.charAt(i) == stack.peek()) {
				stack.pop();
			} else {
				return false;
			}
		}
		if (!stack.isEmpty())
			return false;
		return true;
	}

}
