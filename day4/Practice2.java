package com.capgemini.day4;

// A simple interface
interface In1 {

	// public, static and final
	float a = 10;
}

interface In2 {
	// public and abstract
	void display();
}

// A class that implements the interface.
public class Practice2 implements In1, In2 {

	// Implementing the capabilities of interface.
	public void display() {
		System.out.println("Interface program");
	}

	// Driver Code
	public static void main(String[] args) {
		Practice2 p = new Practice2();
		p.display();
		System.out.println(a);
	}
}
