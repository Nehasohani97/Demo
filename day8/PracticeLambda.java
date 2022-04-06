//Create a lambda to find the even and odd number

package com.capgemini.day8;
//import util.java.Scanner;

interface 	EvenOdd{
	public void evenOdd(int a);
}
public class PracticeLambda {
	public static void main(String[] args) {
		
		EvenOdd result =(int a) -> {
            if(a%2==0)
            System.out.println("Number is even" + a);
            else
            	System.out.println("Number is odd " + a);	
            };
            result.evenOdd(5);
			
		
	}
}
