package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.IntersectionPoint;

public class App {
	public static void main(String[] args) {
		// List 1 - 20 25 30 35 40
		int[] data1 = { 20, 25, 30, 35, 40 };
		Node head1 = new Node(data1[0]);
		Node lastNodeList1 = null;
		for (int count = 1; count < data1.length; count++) {
			lastNodeList1 = IntersectionPoint.insert(head1, data1[count]);
		}
		
		// List 2 - 3 6 9
		int[] data2 = { 3, 6, 9 };
		Node head2 = new Node(data2[0]);
		Node lastNodeList2 = null;
		for (int count = 1; count < data2.length; count++) {
			lastNodeList2 = IntersectionPoint.insert(head2, data2[count]);
		}

		// Common Nodes - 50 51 52 53
		int[] commonData = { 50, 51, 52, 53 };
		Node commonList = new Node(commonData[0]);
		for (int count = 1; count < commonData.length; count++) {
			IntersectionPoint.insert(commonList, commonData[count]);
		}
		
		// 20 25 30 35 40 50 51 52 53
		lastNodeList1.next = commonList;
		// 3 6 9 50 51 52 53
		lastNodeList2.next = commonList;
		System.out.println("1.) Single linked list 1 is :");
		IntersectionPoint.print(head1);
		System.out.println("2.) Single linked list 2 is :");
		IntersectionPoint.print(head2);

		Node intersectNode = IntersectionPoint.intersectionPoint(head1, head2);
		if (null != intersectNode) {
			System.out.printf("3.) Single linked lists are intersected at : %d", intersectNode.data);
		} else {
			System.out.println("3.) Single linked lists are not intersected");
		}
	}
}
