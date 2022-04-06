package com.capgemini.day3;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

//Class can be converted to exception class by extending the Exception class
class OnlyPositiveNumberAllowed extends java.lang.Exception
{​​​​​​​​
    OnlyPositiveNumberAllowed(String msg)
    {​​​​​​​​
        super(msg);
    }​​​​​​​​
}​​​​​​​​

public class Demo 
{​​​​​​​​
    public static void main(String[] args) throws OnlyPositiveNumberAllowed 
	{​​​​​​​​
         //Only accept positive number
          
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        if(num>0)
        {
        ​​​​​​​​	System.out.println(num);
        }
        ​​​​​​​​else
        {​​​​​​​​
            throw new OnlyPositiveNumberAllowed("Only Positive Number");
        //System.out.println("enter only positive nummber");    
        }​​​​​​​​
        
    }
}


​​​​​​​​