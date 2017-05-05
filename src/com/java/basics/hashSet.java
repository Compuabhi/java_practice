package com.java.basics;

import java.util.*;

public class hashSet {

	public static void main(String[] args){
		
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(15);
		hs.add(70);
		hs.add(12);
		hs.add(12);
		hs.add(14);
		hs.remove(70);
		hs.contains(14);
		hs.size();
		hs.isEmpty();
		System.out.println(hs.toString());
		
	
		
		
		
	}
	
	
}
