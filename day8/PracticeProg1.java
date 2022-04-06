//Create a lambda to find the positive and negative number

package com.capgemini.day8;

interface 	PositiveNegative{
	public void positiveNegative(int a);
}
public class PracticeProg1 {

public static void main(String[] args) {
		
		PositiveNegative result =(int a) -> {
            if(a>=0)
            System.out.println("Number is positive " + a);
            else
            	System.out.println("Number is negative " + a);	
            };
            result.positiveNegative(16);
			
	}
}
