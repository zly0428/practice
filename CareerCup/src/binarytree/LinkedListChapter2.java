package binarytree;

public class LinkedListChapter2 {
	
	//2.1 Write code to remove duplicates from an unsorted linked list.
	public Node removeUnsorted( Node head ) {
		if ( head == null || head.next == null ) return head;
		Node cur = head;
		Node ser;
		while ( cur.next != null ) {
			ser = cur.next;
			while ( ser.next != null ) {
				if ( cur.data == ser.data ) {
					ser = ser.next;
					cur.next = ser;
				}
				else {
					ser = ser.next;
				}
			}	
		}
		
		return head;
	}
	// for sorted linkedlist
	public Node remove(Node head) {
		if ( head == null || head.next == null ) return head;
		Node cur = head;
		while ( cur.next != null ) {
			if ( cur.data != cur.next.data )
				cur = cur.next;
			else {
				cur.next = cur.next.next;
			}
		}
		return head;
	}
	//2.2 Implement an algorithm to find the nth to last element of a singly linked list.
	public Node findN( Node head, int n) {
		if ( head == null || n < 1 ) return null;
		Node theNode = head;
		Node pointer = head;
		
		while ( n > 0 ) {
			if ( pointer == null ) return null;
			pointer = pointer.next;
			n--;
		}
		while ( pointer.next != null) {
			theNode = theNode.next;
			pointer = pointer.next;
		}
		return theNode;
	}
	
	//2.3 Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
	public boolean deletNode(Node tobedel) {
		if ( tobedel == null || tobedel.next == null ) return false;
		Node fol = tobedel.next;
		tobedel.data = fol.data;
		tobedel.next = fol.next;
		return true;
	}
	
	// You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1¡¯s digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
	// EXAMPLE
	// Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
	// Output: 8 -> 0 -> 8
	public Node add(Node head1, Node head2) {
		if ( head1 == null && head2 == null ) return null;
		Node result = new Node();
		int c = 0;
		int value = 0;
		Node cur1 = head1;
		Node cur2 = head2;
		Node head = result;
		while ( cur1 != null || cur2 != null) {
			if ( cur1 != null ) {
				value += cur1.data;
				cur1 = cur1.next;
			}
			if ( cur2 != null ) {
				value += cur2.data;
				cur2 = cur2.next;
			}
			result.data = value % 10 + c;
			result = result.next;
			c = value/10;
		}
		return head;
	}
	
	
	class Node {
		public int data;
		public Node next;
		public Node(int d) {
			this.data = d;
		}
		public Node() {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
