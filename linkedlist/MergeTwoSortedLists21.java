package com.leetcode.linkedlist;

public class MergeTwoSortedLists21 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l2 == null && l1 != null)
			return l1;
		if (l1 == null && l2 != null)
			return l2;
		ListNode resultHead = null;
		ListNode temp = null;

		while (l1 != null && l2 != null) {
			if (resultHead == null) {
				if (l1.val < l2.val) {
					resultHead = new ListNode(l1.val);
					l1 = l1.next;
				} else {
					resultHead = new ListNode(l2.val);
					l2 = l2.next;
				}
				temp = resultHead;

			} else {
				if (l1.val < l2.val) {
					temp.next = new ListNode(l1.val);
					l1 = l1.next;
					temp = temp.next;
				} else {
					temp.next = new ListNode(l2.val);
					l2 = l2.next;
					temp = temp.next;
				}

			}

		}
		while (l1 != null) {
			temp.next = new ListNode(l1.val);
			l1 = l1.next;
			temp = temp.next;
		}
		while (l2 != null) {
			temp.next = new ListNode(l2.val);
			l2 = l2.next;
			temp = temp.next;
		}

		return resultHead;
	}
}
