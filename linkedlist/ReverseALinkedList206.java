package com.leetcode.linkedlist;

public class ReverseALinkedList206 {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode current = head;
		ListNode prev = null;
		ListNode next = head;
		while (next != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}

}
