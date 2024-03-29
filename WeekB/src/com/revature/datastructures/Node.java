package com.revature.datastructures;

public class Node<T> {
	/*
	 * This class will represent an element in our LinkedList implementation T is
	 * the generic placeholder for the data-type of the object contained in each
	 * element.
	 */
	private Node<T> nextNode; // reference to next element of the List
	private T data; //actual object held in the current element

	public Node(Node<T> nextNode, T data) {
		super();
		this.nextNode = nextNode;
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
