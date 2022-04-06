package com.capgemini.day7;

import java.util.ArrayList;
public class MyBank {

	public static void main(String[] args) {
		ArrayList<Bank1> m = new ArrayList<Bank1>();
		
		Bank1 b1 = new Bank1(1, "SBI");
		Bank1 b2 = new Bank1(2, "HDFC");
		m.add(b1);
		m.add(b2);
		System.out.println(m);
		}

}
