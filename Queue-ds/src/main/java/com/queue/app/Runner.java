package com.queue.app;

public class Runner {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(5);
		queue.enQueue(4);
		queue.enQueue(3);
		queue.enQueue(2);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(8);
		queue.enQueue(9);
		queue.show();
		System.out.println();
		System.out.println("Queue Size--" +queue.getSize());
	}
}
