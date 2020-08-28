package com.leetcode.linkedlist;

import java.util.HashMap;

public class CopyListWithRandomPointer138 {

	public Node copyRandomList(Node head) {

		if (head == null) {
			return null;
		}

		HashMap<Node, Node> oldNewListMapping = new HashMap<>();
		HashMap<Node, Node> oldListRandomPtrtMapping = new HashMap<>();
		Node oldListCurrentPtr = head.next;
		Node newListHead = new Node(head.val);
		Node newListCurrentPtr = newListHead;
		oldNewListMapping.put(head, newListHead);
		oldListRandomPtrtMapping.put(head, head.random);

		while (oldListCurrentPtr != null) {
			newListCurrentPtr.next = new Node(oldListCurrentPtr.val);
			oldNewListMapping.put(oldListCurrentPtr, newListCurrentPtr.next);
			oldListRandomPtrtMapping.put(oldListCurrentPtr, oldListCurrentPtr.random);
			newListCurrentPtr = newListCurrentPtr.next;
			oldListCurrentPtr = oldListCurrentPtr.next;

		}
		newListCurrentPtr = newListHead;
		oldListCurrentPtr = head;
		while (newListCurrentPtr != null) {
			newListCurrentPtr.random = oldNewListMapping.get(oldListRandomPtrtMapping.get(oldListCurrentPtr));
			newListCurrentPtr = newListCurrentPtr.next;
			oldListCurrentPtr = oldListCurrentPtr.next;
		}
		return newListHead;
	}
}
