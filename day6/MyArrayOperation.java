//Insert , Update ,Delete , Sort the element 

package com.capgemini.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class MyArrayOperation {

	public static void main(String[] args) {
	
		ArrayList<String>list = new ArrayList<String>();
		//Adding elements
		list.add("Ram");
		list.add("Sam");
		list.add("Bam");
		list.add("Dam");
		System.out.println(list);
		
		//Insert an element to the ArrayList at the end
		list.add("Aam");
		System.out.println(list);
		
		//Adding an element at the specific position or at an index
		list.add(2,"Kam");
		System.out.println(list);
		
		//Update an element to the ArrayList
		list.set(4, "Neha");
		System.out.println(list);
		
		//Delete an element to the ArrayList
		list.remove(5);
		System.out.println(list);
		
		//Sort an ArrayList
		Collections.sort(list);
		System.out.println(list);
		
		//Delete all elements
		list.clear();
		System.out.println(list);
	}

}
