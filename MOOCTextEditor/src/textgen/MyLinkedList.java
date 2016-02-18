package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		// TODO: Implement this method
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) 
	{
		// TODO: Implement this method
		if ( element == null) return false;
		LLNode<E> newNode = new LLNode(element);
		if ( head == null) {
			head = newNode;
			tail = newNode;
			size++;
		}
		else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
			size++;
		}
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	{
		// TODO: Implement this method.
		if ( index < 0 || index > size - 1 ) {
			throw new IndexOutOfBoundsException("Out of Bounds!");
		}
		if ( head == null) {
			throw new NullPointerException("Null Pointers!");
		}
		LLNode<E> cur = head;
		while ( index > 0) {
			cur = cur.next;
			index--;
		}
		
		return cur.data;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		// TODO: Implement this method
		LLNode<E> newNode = new LLNode<E>(element);
		if ( index < 0 || index > size ) {
			throw new IndexOutOfBoundsException("Out of Bounds!");
		}
		if ( element == null) {
			throw new NullPointerException("Null Pointers!");
		}
		if ( head == null && index == 0) {
			head = newNode;
			tail = newNode;
			size++;
		}
		else {
			if ( index == 0 ) {
				LLNode<E> temp = head;
				head = newNode;
				newNode.next = temp;
				temp.prev = newNode;
				size++;
			}
			else {
				LLNode<E> cur = head;
				LLNode<E> par = head;
				while ( index > 0  ) {
					par= cur;
					cur = cur.next;
					if ( cur == null) {
						break;
					}
					index--;
				}
				par.next = newNode;
				newNode.prev = par;
				newNode.next = cur;
				cur.prev = newNode;
				size++;
			}

		}
	}


	/** Return the size of the list */
	public int size() 
	{
		// TODO: Implement this method
		return this.size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		// TODO: Implement this method
		if ( index < 0 || index > size - 1 ) {
			throw new IndexOutOfBoundsException("Out of Bounds!");
		}
		
		if ( head == null) {
			throw new NullPointerException("Null Pointers!");
		}
		LLNode<E> temp;
		if ( index == 0) {
			temp = head;
			head = head.next;
			size--;
		}
		else {
			LLNode<E> cur = head;
			LLNode<E> par = head;
			while ( index > 0) {
				par = cur;
				cur = cur.next;
				index--;
			}
			temp = cur;
			if ( cur.next != null) {
				par.next = cur.next;
				cur.next.prev = par;
				size--;
			}
			else {
				tail = par;
				par.next = null;
				size--;
			}
		}
		return temp.data;
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
		if ( index < 0 || index > size - 1 ) {
			throw new IndexOutOfBoundsException("Out of Bounds!");
		}
		if ( element == null) {
			throw new NullPointerException("Null Pointers!");
		}
		LLNode<E> cur = head;
		while ( index > 0) {
			cur = cur.next;
			index--;
		}
		E oldValue = cur.data;
		cur.data = element;
		return oldValue;
	}
/*
	public String toString() {
		LLNode<E> cur = head;
		String temp = "";
		while( cur != null) {
			temp += cur.data+"->";
			cur = cur.next;
		}
		return temp;
	}
*/
	
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor
	
	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}
	public String toString() {
		String temp = data+"";
		return temp;
	}
}
