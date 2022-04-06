package com.capgemini.helloworld;

import java.util.Scanner;

class UderAge extends Exception {
	UderAge(String msg)
	{
       super(msg);
	}
}

public class Demo {

	public static void main(String[] args) {
		
		try
		{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 18) {
			System.out.println("Enter the vote");

		} else {
			throw new UderAge("Exception ");

		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
