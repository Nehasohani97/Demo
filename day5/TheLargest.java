package com.capgemini.day5;

import java.util.Scanner;
public class TheLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[3];
		for(int i = 0; i < a.length; i++ )
		{
			System.out.println("Enter the value of index "+ i);
			a[i] = sc.nextInt();
			
		}
		int max = a[0];
		for (int i = 0; i < a.length; i++)
		{
				if(max < a[i])
				{
					max = a[i];
				}
		}
		System.out.println("The largest number of this array is " + max);
	
	}
}
