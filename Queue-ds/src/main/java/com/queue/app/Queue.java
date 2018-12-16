package com.queue.app;

/**
 * @author dialla
 * 
 *         Queue implementaion using array
 *
 */
public class Queue {

	/**
	 * size of the queue
	 */
	int queue[] = new int[5];
	/**
	 * size of an array
	 */
	int size;
	/**
	 * rear value for insert
	 */
	int rear;

	/**
	 * to do front for delete
	 */
	int front;

	/**
	 * @param data
	 * 
	 *             insert into the queue
	 */
	public void enQueue(int data) {
		// if queue is not full then only i am adding into the queue
		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size = size + 1;
		} else
			System.out.println("Queue is full");
	}

	/**
	 * @return
	 * 
	 * 		to do delete the data from the queue
	 */
	public int deQueue() {
		int data = queue[front];
		// if queue is not empty then only i am delete the element in the queue
		if (!isEmpty()) {
			front = (front + 1) % 5;
			size--;
		} else {
			System.out.println("queue is empty");

		}
		return data;

	}

	/**
	 * to do display the data queue
	 * 
	 */
	public void show() {
		System.out.print("Elements are:-");

		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % 5] + " ");
		}

	}

	/**
	 * @return
	 * 
	 * 		function for return the size
	 */
	public int getSize() {
		return this.size;
	}

	/**
	 * @return function for check empty Queue
	 */
	public boolean isEmpty() {
		return getSize() == 0;
	}

	/**
	 * @return function for check Queue is full
	 */
	public boolean isFull() {
		return getSize() == 5;
	}

}
