package com.java.queue;

public class qImpl {

	private Node front = null, rear = null;
	int size = 0;

	private class Node {
		private int data;
		private Node next;
	}

	public boolean isEmpty() {

		return (front == null);

	}

	public void enqueue(int data) {

		Node temp = new Node();
		size++;
		temp.data = data;
		temp.next = null;
		if (isEmpty())
			front = rear = temp;
		else {
			rear.next = temp;
			rear = temp;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		size--;
		int temp = front.data;
		front = front.next;
		return temp;

	}

	public int front() {

		return front.data;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		qImpl q1 = new qImpl();

		q1.enqueue(32);
		q1.enqueue(132);
		q1.enqueue(234);
		System.out.println("value is " + q1.dequeue());
		q1.enqueue(222);
		System.out.println("size is " + q1.size());
		System.out.println("value is " + q1.front());
		System.out.println("value is " + q1.dequeue());
		q1.enqueue(3200);
		System.out.println("value is " + q1.dequeue());
		q1.enqueue(31);
		q1.enqueue(2);
		System.out.println("size is " + q1.size());
		System.out.println("value is " + q1.dequeue());

	}

}
