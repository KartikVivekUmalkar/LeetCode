package com.leetcode.linkedlist;

//Given a non-empty, singly linked list with head node head, return a middle node of linked list.
//
//If there are two middle nodes, return the second middle node.
public class MiddleOfTheLinkedList876 {
	public ListNode middleNode(ListNode head) {

		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		ListNode slowPointer = head;
		ListNode fastPointer = head.next;
		while (fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}

		if (fastPointer != null) {
			return slowPointer.next;
		}
		return slowPointer;
	}

}
