package com.capgemini.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyList {

	public static void main(String[] args) {
		//Creating an Array List
		ArrayList<Integer>p = new ArrayList<Integer>(); 
		
		 // add elements to the list
		p.add(0);
		p.add(1);
		p.add(1);
		p.add(2);
		p.add(3);
		
		 // printing the array list
		System.out.println(p);
		
		 // Iterating ArrayList using Iterator
		 Iterator itr=p.iterator();  //getting the Iterator  
		 while(itr.hasNext())        //check if iterator has the elements
		 {  
			 System.out.println(itr.next());//printing the element and move to next  
		 }  
		
		
		
	}

}

