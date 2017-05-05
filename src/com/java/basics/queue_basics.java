package com.java.basics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue_basics {

	
	public static void main(String[] args){
		
		Queue q1=new LinkedList();
		Queue q2=new LinkedList();
		q1.add(12);
		q1.add(112);
		q1.add(120);
		q1.remove();//Retrieves and removes the head of this queue.
		q1.poll();//same as remove
		q1.peek();//only reads head of queue
		q1.toArray();
		q1.toString();
		System.out.println(q1.toString());
		Object[]arr = new Object[3];
		int i=0;
		for(Object o:q1.toArray()){
			arr[i++]=o;
		};
//		System.out.println(" "+arr[0]+" "+arr[1]+" "+arr[2]);
//		don't print directly elements of an array;
//		q1.add(2,119); this is not allowed ,so we can't insert at particular location
//		we can't use q1.get(2);
		System.out.println(q1.toString());
		int	x=(int) q1.peek();
		q1.size();
		q1.isEmpty();
	
		q1.add(110);
		q1.remove(3);
		System.out.println(q1.toString());
//		System.out.println("index is"+ q1.indexOf(120));index method not applicable for queue
//		System.out.println("last index is"+ q1.lastIndexOf(120));
		if(q1.contains(111))
			System.out.println("112 is there");
		
//		q1.lastIndexOf(12);not applicable
		Collections.max(q1);
//		Collections.fill(q1, 0); not applicable in java
//		if sorting is required create priority queue not simple queue
		
	}
	
}
