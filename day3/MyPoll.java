package com.capgemini.day3;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

//Class can be converted to exception class by extending the Exception class
class UnderAge extends java.lang.Exception
{​​​​​​​​
	UnderAge(String msg)
    {​​​​​​​​
        super(msg);
    }​​​​​​​​
}​​​​​​​​

public class MyPoll {
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        if(num>18)
        {
        ​​​​​​​​	System.out.println("Eligible for vote");
        }
        else
        {
        	System.out.println("Eligible for vote");
        }
	}

}
