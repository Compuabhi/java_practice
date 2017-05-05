package com.java.basics;

//all important methods for java;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class java_basics {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		
//	Arrays methods	
		int[]n1={1,2,3};
		int []n2={1,2,3};
		Arrays.equals(n1, n2); //Returns true if the two specified arrays of ints are equal to one another. 
		int t1=Arrays.binarySearch(n1, 2);	//Searches the specified array of ints for the specified value using the binary search algorithm.
		Arrays.fill(n1, 0);
		Arrays.sort(n1);
		Arrays.sort(n1, 1, 2);//
		
//		BigInteger methods
		BigInteger b1=new BigInteger("12345677");
		BigInteger b2=new BigInteger("12345672233");
		BigInteger b3=b1.add(b2);
		BigInteger b4=b1.subtract(b2);
//		BigInteger b5=b1.multiply(val);b1.remainder(b3);b1.max(b3);b1.divide(b3);b1.min(b2);
		Long l1=b1.longValue();
		int x=b1.intValue();
		BigDecimal f1=new BigDecimal("134.56");
		BigDecimal f2=new BigDecimal ("12563324.23");
		float f3=f1.floatValue();
		double d1=f1.doubleValue();
		f1.compareTo(f2);
		f1.equals(f2);
		
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String sentence=br.readLine();
	String sentence="my name is abhishek";
		int i=0;
//		don't try to scan text with nextLine(); AFTER using nextInt() with the same scanner!
//		It doesn't work well with Java Scanner,
		char[]arr="abhishek".toCharArray();
		
		
		Queue q1 = new LinkedList();
//		 q1.add(arg0);
		 q1.poll();
		 q1.size();
		 q1.peek();
//		 q1.remove(o);
		 
//		 you cannot create a queue instance using queue as it is abstract so linkedlist instance is used
		String str[]=sentence.split("\\s+");//splitting about space
		for(String word:str){
//			System.out.println(word+i++);
		}
		int marks[]=new int[10];
		
//  Converting collection to an array
//		Where x is the collection:
//  x.toArray (new Foo[x.size ()])


		char[]name="abhishek".toCharArray();
		"abhishek".toLowerCase();
		String str3="abhi".toUpperCase();
		char c="abhi".charAt(2);
		
		char[]name1={'a','b','c'};
		System.out.println(name1);
		
		System.out.println("length is"+name.length);
		CharSequence cd="agrgh";//Since String IS-A CharSequence, you can pass a String wherever
					//		you need a CharSequence, or assign a String to a CharSequence:
		
		boolean check="tuagrghid".contains(cd);
		
		String str1=sentence.concat("kumar");
		String str2="afdghjh".substring(2,6);
		String str4=sentence.trim();//for trimming the space
		String str5=name1.toString();
		String str6=String.valueOf(5);//convert anything to String;
		String s11="abhi";
		String s2="abii";
		int p=s11.compareTo(s2);//Compares two strings lexicographically
		s11.equals("abhi");//Compares this string to the specified object. The result is true if and only if the argument is not null and 
//		is a String object that represents the same sequence of characters as this object.

		int x11=s11.hashCode();//Returns a hash code for this string
		int i1=s11.lastIndexOf("abc");//Returns the index within this string of the last occurrence of the specified substring
		int i3=s11.indexOf("abc");//Returns the index within this string of the first occurrence of the specified substring
		
		
	
		
		
		boolean check1=sentence.contains(cd);//uses charsequence
		boolean check2=sentence.equals("aff");
		
		int check3="boy".compareTo("apple");
		int check4=sentence.indexOf('n');//for searching
		
		System.out.println(check3);
		
		
		
		
		
		List<Integer>l11=new LinkedList<Integer>();
		List<Integer>l12=new LinkedList<Integer>();
		l11.size();//returns the number of elements in this list
		l11.add(12);// Appends the specified element to the end of this list 
		l11.get(0); //returns element at the specified index
		l11.clear();//Removes all of the elements from this list (optional operation). The list will be empty after this call returns.
		l11.remove(5);
		l11.contains(5);//Returns true if this list contains the specified element.
//	    l11.add(index, element) ;//Inserts the specified element at the specified position in this list 
//		l11.indexOf(1);  Returns the index of the first occurrence of the specified element in this list i.e 1
		l11.equals(l12);
		l11.toArray();
		//l11.lastIndexOf(12);
		l11.isEmpty();
		l11.toString();
		
		
		int index=4;
	
		 Collections.swap(l11, index, l11.size()-1);
// swapping elements of an arraylist or linkedlist		
		
		Stack s1=new Stack();
//		s1.push(arg0);    s1.add(e)
		s1.pop();
		s1.peek();
		s1.isEmpty();
		s1.size();
//		s1.contains(o)
//		s1.add(e)
		
		

	
		
		
	}

	
	

	
}
