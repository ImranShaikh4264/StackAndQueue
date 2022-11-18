package com.bridgelab.stackAndQueue;

public class QueueMain {
	public static void main(String[] args) {
		Queue queue= new Queue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.print();
		System.out.println("");
		System.out.println(queue.dequeue());
		queue.print();


	}
}
