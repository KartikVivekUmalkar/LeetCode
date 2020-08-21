package com.leetcode.stack;

//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//
//push(x) -- Push element x onto stack.
//pop() -- Removes the element on top of the stack.
//top() -- Get the top element.
//getMin() -- Retrieve the minimum element in the stack.

import java.util.Stack;

public class MinStack155 {

	Stack<Integer> stack;
	Stack<Integer> min;

	public MinStack155() {
	        stack = new Stack();
	        min = new Stack();
	    }

	public void push(int x) {
		if (!min.isEmpty()) {
			if (x <= min.peek()) {
				min.push(x);
			}
		} else {
			min.push(x);
		}
		stack.push(x);
	}

	public void pop() {
		if (stack.peek() <= min.peek()) {
			min.pop();
		}
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		if (!min.isEmpty())
			return min.peek();
		else
			return -1;
	}
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */
