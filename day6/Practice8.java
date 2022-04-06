package com.capgemini.day6;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class Practice8 {
	public static void main(String[] args) {
	        
	        //it does not maintain the order
	        //it does not contain the duplicate element
	        //it use the hash internally 
	        //HashSet<Integer> set=new HashSet<Integer>();
	        
	        
	        //linkedHashSet
	        //it maintain the order
	        //it does not contain the duplicate
	        //it internally use the liked list
	        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
	        
	        set.add(10);
	        set.add(1);
	        set.add(100);
	        set.add(105);
	        set.add(10);
	        System.out.println(set);
	        
	        
	        Object[] arr=set.toArray();
	        System.out.println(arr.length);
	        for(Object obj:arr)
	        {
	            System.out.println((Integer)obj);
	        }
	        
	        //set.clear();
	        
	        set.contains(10);
	        set.forEach(System.out::println);
	        
	        //set.isEmpty();
	        
	        //set.remove(10);
	        
	        set.size();
	        
	        
	   }
}
	 

