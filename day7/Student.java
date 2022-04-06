package com.capgemini.day7;

import java.util.Map;
import java.util.HashMap;

class StudentDetails {
	int id;
	String name;
	long phoneno;
	
	StudentDetails() {
	}

	StudentDetails(int id, String name, long phoneno) {
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
	}
}

public class Student {
	public static void main(String[] args) {
		HashMap<Integer, StudentDetails> hm = new HashMap<Integer, StudentDetails>();
		StudentDetails s1 = new StudentDetails(24, "Neha", 123456);
		StudentDetails s2 = new StudentDetails(49, "Reshma", 123486);
		StudentDetails s3 = new StudentDetails(66, "Megha", 123454);
		
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);

		for (Map.Entry<Integer, StudentDetails> m : hm.entrySet()) {

		System.out.println(m.getKey()+ " " + m.getValue().id+ " " + m.getValue().name+ " " + m.getValue().phoneno);
		}

	}
}