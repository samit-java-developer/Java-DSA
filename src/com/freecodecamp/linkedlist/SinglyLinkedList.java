package com.freecodecamp.linkedlist;

public class SinglyLinkedList {
	
	private ListNode head;
	
	private static class ListNode<T>{
		private T data;// geniric type
		private ListNode next;
		
		public ListNode(T data) {
			this.data = data;
			this.next=null;
		}
		
	}
	
	private void printData(ListNode temp) {
		while (temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		SinglyLinkedList obj=new SinglyLinkedList();
		obj.head=new ListNode(10);
		obj.printData(obj.head);
	}

}
