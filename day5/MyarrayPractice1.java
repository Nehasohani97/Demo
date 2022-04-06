package com.capgemini.day5;

import java.util.Scanner;

public class MyarrayPractice1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
        for (int i = 0; i < a.length; i++)
        {
        	
        	System.out.println("Enter the value of index "+ i);
        	a[i] = sc.nextInt();
        }
        System.out.println("The array you created is "+ a );
	}
}
