package com.java.queue;

import java.awt.List;
import java.util.LinkedList;
import java.util.Queue;

 

	
	class queueClass{
		
		private int size=0,front=-1,rear=-1,capacity;
		private int[]arr;
		
		
		queueClass(int x){
			
			this.arr=new int[x];
			this.capacity=x;
			
		}
		public boolean isFull(){
			
			return (rear+1)%capacity == front ? true : false;			
		}
		
		public boolean isEmpty(){
		
			return (front==-1 && rear==-1);
			
			
		}
		public int size(){
			
			return size;
		}
		
		public void enqueue(int data){
			
		if(isFull())
			System.out.println("queue is full");
		else if(isEmpty())
		{	arr[0]=data;
			size++;
			front=rear=0;
		}
			
		else{
			rear=rear+1%capacity;
			arr[rear]=data;
			
			size++;
		}
			
			
		
			
		}
		
		public int dequeue(){
			int temp;
			if(isEmpty())
				{System.out.println("queue is empty");
				return -1;
				}
				
			else if(front==rear){
				temp=arr[rear];
				front=rear=-1;
				size--;
				return temp;
				
				
				
			}
			else{
				temp=arr[front];
				size--;
				front=(front+1)%capacity;
				return temp;
			}
				
			
			
			
		}
		
		
	
	

	public static void main(String[] args)
	{
		queueClass qclass=(new queueClass(20));
		qclass.enqueue(23);
		qclass.enqueue(223);
		System.out.println(qclass.dequeue());
		System.out.println(qclass.dequeue());
		qclass.enqueue(43);
		qclass.enqueue(4344);
		qclass.enqueue(430);
		qclass.enqueue(1143);	qclass.enqueue(1111);
		System.out.println(qclass.dequeue());
		System.out.println(qclass.dequeue());
		qclass.enqueue(430);
		System.out.println(qclass.dequeue());
		System.out.println(qclass.dequeue());
	}
	
	
	
	
	
	
	
	
	
}
