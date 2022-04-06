package com.capgemini.day5;

public class TheSmallest {
	public static void main(String[] args) {

		int[] a = { 40, 7, 6, 26, 34, 8 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
				System.out.println("The smallest number of this array is " + min);
			}

		}
	}
}
