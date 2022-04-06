package com.capgemini.day5;

	import java.util.Scanner;
	//Create a Array with int type show
	//Create a Array with double type show
	//Create a Array with float type show
	//Create a Array with String type show


	//Find the largest number from array
	//Find the index value of give value 5 (index value)
	//Delete the element of array
	//Sort the all the element of array 
	//find the smallest number

public class MyArray {

​​​​	public static void main(String[] args) {​​​​​​​​


	        // Length=number of element 10
	        // index will start with zero and length-1;
	        // 0-9
	        // always give the positive index value
	        String arr[] = new String[5];
	        long[] arr1 = new long[5];
	        double arr2[] = {​​​​​​​​ 1, 2, 3, 4, 5 }​​​​​​​​;
	        short[] arr3 = {​​​​​​​​ 1, 2, 3, 4 }​​​​​​​​;


	        /*
	         * System.out.println(arr.length); System.out.println(arr1.length);
	         * System.out.println(arr2.length); System.out.println(arr3.length);
	         */


	        Scanner sc = new Scanner(System.in);
	        for (int i = 0; i < arr.length; i++) {​​​​​​​​
	            System.out.println("Enter the value of index " + i);
	            arr[i] = sc.nextInt();
	        }​​​​​​​​


	        for (int i = 0; i < arr.length; i++) {​​​​​​​​
	            System.err.println("Enter the value of index " + i + " " + arr[i]);


	        }​​​​​​​​


	        /*
	         * arr1[0] = 1; arr1[1] = 1; arr1[2] = 1; arr1[3] = 1;
	         * 
	         * System.out.println(arr1[0]); System.out.println(arr1[1]);
	         * System.out.println(arr1[2]); System.out.println(arr1[3]);
	         * System.out.println(arr1[4]);
	         */ // int type is by default is zero


	        // if we try to access value greater than index value then
	        // exception : java.lang.ArrayIndexOutOfBoundsException
	        //System.out.println(arr1[-1]);
	    }​​​​​​​​
}
