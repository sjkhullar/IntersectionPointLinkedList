package org.learn.Question;

import org.learn.List.Node;

public class IntersectionPoint {
	public static Node intersectionPoint(Node head1, Node head2) {
		int length1 = length(head1);
		int length2 = length(head2);

		Node largerList = null;
		Node smallerList = null;
		if (length1 > length2) {
			largerList = head1;
			smallerList = head2;
		} else {
			largerList = head2;
			smallerList = head1;
		}
		return getIntersetPoint(largerList, smallerList, Math.abs(length1 - length2));
	}

	private static Node getIntersetPoint(Node largerList,Node smallerList,int lengthDifference) {
		int count = 0;
		while (count++ < lengthDifference) {
			largerList = largerList.next;
		}
		while (largerList != null && smallerList != null) {
			if (largerList == smallerList)
				return largerList;
			largerList = largerList.next;
			smallerList = smallerList.next;
		}
		return null;
	}

	public static int length(Node head) {
		int length = 0;
		while (head != null) {
			head = head.next;
			length++;
		}
		return length;
	}

	public static Node insert(Node head, int data) {
		while (head.next != null)
			head = head.next;
		head.next = new Node(data);
		return head.next;
	}

	public static void print(Node head) {
		while (head != null) {
			System.out.printf("%d ", head.data);
			head = head.next;
		}
		System.out.println("");
	}
}
