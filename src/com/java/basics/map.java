package com.java.basics;

import java.util.*;

public class map {

	
	public static void main(String[] args){
		
		HashMap hm=new HashMap();
		HashMap hm1=new HashMap();
		hm.put(1, "abhi");
		hm.put(2, "sonu");
		hm.put(3, "raja");
		hm.put(4, "zack");
		String str=(String)hm.get(3);
		if(hm.containsKey(2))
			System.out.println(hm.get(2));
		hm.remove(4);
		Collection l1=null;
		l1=hm.values();
		System.out.println(l1.toString());
		Set hs=null;
		hs= hm.keySet();
		System.out.println(hs.toString());
		if(hm.containsValue("abhi"))
			System.out.println(" " +" abhi"+" " );
		hm.size();
		hm.isEmpty();
		hm.equals(hm1);
		System.out.println("     "+ hm);
//		important Maths methods
		Math.abs(5);
		Math.exp(2.0);
		Math.floor(2.8);
		Math.log(3.2);//base e
		Math.ceil(2.5);
		Math.pow(2,4);
		Math.random();
		
		
		
	}
	
}
