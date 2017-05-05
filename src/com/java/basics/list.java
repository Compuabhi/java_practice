package com.java.basics;
import java.util.*;
public class list {

	public static void main(String[] args){
		
		String s1="abc"; 
		Double s2=2.34;
		List l1=new LinkedList();
		l1.add(4);
		l1.add(7);
		l1.add(12);
		l1.add(14);
		l1.add(14);
		l1.remove(2);
		List l2=new LinkedList();
		l2.add(4);l2.add(7);l2.add(14);
		if(l1.equals(l2))
			System.out.println("l1  =   l2");
		System.out.println(l1.get(2));
		l1.add(3,17);//equivalent to insert ....14 will be shifted to next index;
		if(l1.contains(2))
			System.out.println("4"+"is found");
		for(Object o:l1.toArray())
		System.out.println(o+" ");
		
		System.out.println(l1.indexOf(14));
		System.out.println(l1.lastIndexOf(14));
		
		System.out.println(""+(l1));
		l1.set(0,3);
		System.out.println(""+(l1));
		
		
		Collections.sort(l1);
		Collections.max(l1);
		
		
		
	}
	
	
}
