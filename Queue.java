package com.bridgelab.stackAndQueue;

public class Queue<T> {
	LinkedList<T> list=new LinkedList<>();
	void enqueue(T key) {
		list.add(key);
	}
	public T dequeue() {
		return list.popLast();
	}
	void print() {
		list.display();
	}
}
