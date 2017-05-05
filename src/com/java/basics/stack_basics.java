package com.java.basics;
import java.util.*;
public class stack_basics {

	public static void main(String[] args){
	
		Stack s1=new Stack();
		Stack s2=new Stack();
		s1.push(12);
		s1.push(112);
		s1.add(120);
		System.out.println(s1.toString());
		Object[]arr = new Object[3];
		int i=0;
		for(Object o:s1.toArray()){
			arr[i++]=o;
		};
//		System.out.println(" "+arr[0]+" "+arr[1]+" "+arr[2]);
//		don't print directly elements of an array;
		s1.add(2,119);
		System.out.println(s1.toString());
		int x=(int)s1.pop();
		x=(int) s1.peek();
//		s1.size();
//		s1.isEmpty();
		System.out.println(s1.get(2));
		s1.add(110);
		s1.remove(3);
		s1.add(0, 120);
		s1.add(3,120);
		System.out.println(s1.toString());
		System.out.println("index is"+ s1.indexOf(120));
		System.out.println("last index is"+ s1.lastIndexOf(120));
		if(s1.contains(111))
			System.out.println("112 is there");
		
		s1.equals(s2);
		s1.lastIndexOf(12);
		System.out.println(s1.toString());
		Collections.sort(s1);
		System.out.println(Collections.max(s1));
//		Collections.fill(s1, 0);
		Collections.swap(s1, 0,4);
		System.out.println(s1.toString());

		
		
		
	}
	
}
