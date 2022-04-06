package com.capgemini.day7;

import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class EmpDetails {
	public static void main(String[] args) {
		// Create Employee map
		Map<Integer, String> empList = new HashMap<Integer, String>();

		// Adding emp details
		empList.put(1224, "Neha");
		empList.put(1663, "Sohani");
		empList.put(11005, "Mohanty");

		Set<Integer> keys = empList.keySet();
		for (Integer key : keys) {
			System.out.println(empList);
		}
		// Size
		System.out.println(empList.size());

		// searching key/values
		System.out.println(empList.containsKey(1224));
		System.out.println(empList.containsValue("Mohanty"));
		System.out.println(empList.containsValue("mohanty"));
		
		// removing
		System.out.println(empList.remove(11005));
		
		
		// String java.util.TreeMap.replace(Integer key, String value)
		//Replaces the entry for the specified key only if it is currently mapped to some value.
		
		System.out.println(empList.replace(1224, "Megha"));
		System.out.println(empList.get(1224));
		
		
		
		
		
		
		
	}
}
