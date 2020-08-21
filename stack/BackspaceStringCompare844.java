package com.leetcode.stack;

import java.util.Stack;

//Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
//
//Note that after backspacing an empty text, the text will continue empty.
public class BackspaceStringCompare844 {

	public boolean backspaceCompare(String S, String T) {

		Stack<Character> stackS = new Stack<>();
		Stack<Character> stackT = new Stack<>();

		for (int i = 0; i < S.length(); i++) {

			if (S.charAt(i) == '#' && !stackS.isEmpty()) {
				stackS.pop();
			} else if (S.charAt(i) != '#') {
				stackS.push(S.charAt(i));
			}
		}

		for (int i = 0; i < T.length(); i++) {

			if (T.charAt(i) == '#' && !stackT.isEmpty()) {
				stackT.pop();
			} else if (T.charAt(i) != '#') {
				stackT.push(T.charAt(i));
			}
		}

		if (stackS.size() != stackT.size()) {
			return false;
		}

		while (!stackT.isEmpty()) {
			if (stackT.peek() != stackS.peek())
				return false;
			stackS.pop();
			stackT.pop();
		}

		return true;
	}

}
