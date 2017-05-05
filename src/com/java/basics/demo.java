package com.java.basics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class demo {
	
	public static void main(String[] args){
	String s1="100010";
	StringBuilder sb=new StringBuilder();
	
	String s2="11";
	System.out.println(" "+  addBinary(s1,s2));
	}
	
    public static String addBinary(String a, String b) {
        int m=a.length();
        int n=b.length();
        int max=Math.max(m,n);
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();
        int[]ans=new int[max+1];
        int carry=0;
    for(int i=0;i<max;i++){
        int t=(n-1-i>=0)?b1[n-1-i]-'0':0;
        int q=(m-1-i>=0)?a1[m-1-i]-'0':0;
       
        if((q+t+carry)==1)
        {ans[max-i]=1;
        carry=0;
            
        }
        else if((q+t +carry)==2)
        {
            ans[max-i]=0;
            carry=1;
        }
        else if((q+t + carry)==0)
        {
            ans[max-i]=0;
            carry=0;
        }      
        else
        {
            ans[max-i]=1;
            carry=1;
        }
    }
    
    if(carry==1)
    ans[0]=1;String result="";
    for(int x:ans)
       if(x!=0 ||!result.equals("0"))
        result+=""+x;
       int i=0;
       
//       /*
        while( i<(result.length()-1) && result.charAt(i)=='0')
       {
       String result1=result.substring(i+1,result.length());
       result=result1;
        
       }
       
//       */
       return result;
    }
	
}
