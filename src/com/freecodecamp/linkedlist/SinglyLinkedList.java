package com.freecodecamp.linkedlist;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;// geniric type
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void display() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	private int noOfElementsInList() {
		ListNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void insertFirst(int data) {
		ListNode first = new ListNode(data);
		first.next = head;
		head = first;
	}

	public void insertLast(int data) {
		ListNode first = new ListNode(data);
		if (head == null) {
			head = first;
			return;
		}
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = first;
	}

	public void insertAtPosition(int value, int pos) {
		ListNode node = new ListNode(value);
		if (head == null) {
			head = node;
			return;
		}
		if (pos == 1) {
			node.next = head;
			head = node;
			return;
		} else {
			ListNode previous = head;
			while (pos > 2) {
				previous = previous.next;
				pos--;
			}
			ListNode after = previous.next;
			node.next = after;
			previous.next = node;
			return;
		}
	}

	public ListNode deleteFirst() {
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

	public ListNode deleteLast() {
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		ListNode deletNode=temp.next;
		temp.next = null;
		return deletNode;
	}

	public ListNode deleteAtPosition(int pos) {
		if (head == null) {
			return null;
		}
		if (pos == 1) {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		} else {
			ListNode previous = head;
			while (pos > 2) {
				previous = previous.next;
				pos--;
			}
			ListNode deletNode = null;
			ListNode current = null;
			if (previous != null && previous.next != null && previous.next.next != null) {
				deletNode = previous.next;
				current = previous.next.next;
				deletNode.next = null;
				previous.next = current;
			}
			return deletNode;
		}
	}
	
	private void reverseLinkedList() {
		ListNode current=head;
		ListNode prev=null;
		while (current!=null) {
			ListNode temp=current;
			current=current.next;
			temp.next=prev;
			prev=temp;
		}
		head=prev;
	}

	public static void main(String[] args) {
		SinglyLinkedList obj = new SinglyLinkedList();
		obj.head = new ListNode(10);
		obj.display();
		System.out.println("No of elements--: " + obj.noOfElementsInList());
		System.out.println("Before inserting at first");
		obj.display();
		obj.insertFirst(6);
		System.out.println("After inserting at first");
		obj.display();
		System.out.println("Before inserting at last");
		obj.display();
		obj.insertLast(14);
		System.out.println("After inserting at last");
		obj.display();
		System.out.println("Before inserting at postion at 2");
		obj.display();
		obj.insertAtPosition(5, 2);
		System.out.println("Before inserting at postion at 2");
		obj.display();
		obj.insertAtPosition(8, 2);
		obj.display();
		
		System.out.println("\n============================\n");
		
		System.out.println("List after deleting the first element "+obj.deleteFirst().data);
		obj.display();
		
		System.out.println("List after deleting the last element "+obj.deleteLast().data);
		obj.display();
		
		System.out.println("List after deleting the second element "+obj.deleteAtPosition(2).data);
		obj.display();
		
		obj.reverseLinkedList();
		
		System.out.println("List after reverse");
		obj.display();
	}

}
