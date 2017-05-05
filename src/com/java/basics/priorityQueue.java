package com.java.basics;

import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args){
		PriorityQueue pq=new PriorityQueue();
		pq.add(14);
		pq.add(5);
		pq.add(12);
		pq.add(123);
		System.out.println(pq.toString());
		pq.remove(123);
		System.out.println(pq.toString());
		pq.remove();
		System.out.println(pq.toString());
		
		
		
	}
	
	
	
}
