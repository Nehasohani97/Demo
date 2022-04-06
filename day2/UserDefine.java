package com.cpag.day2;

 

import java.io.PrintStream;
import java.util.Scanner;

 

public class MYScanner {
    public static void main(String[] args) {
       //  class   variable(object)     //constructor
        //creating the object of scanner class
        Scanner sc= new Scanner(System.in);    
        PrintStream output=new PrintStream(System.out);
        System.out.println("enter value other than int");
        int num5=sc.nextInt();
        System.out.println(num5);
        
        
        //print the message on console to enter input value
        
          System.out.println("Enter Number 1"); //reading the int value //nextInt
         // method from the scanner class return the int value //using object you will
         // able to call variable and method
          int num1=sc.nextInt();
          System.out.println("entered number is "+num1);
          
          //read and return the float value output.println("Enter the float number");
          float f=sc.nextFloat(); System.out.println("float number "+f);
          
          //read and return the double value System.out.println("enter double value");
          double d=sc.nextDouble(); System.out.println("Print double "+d);
          
          //read and return the boolean value
          System.out.println("enter boolean value"); boolean b=sc.nextBoolean();
          System.out.println("Print boolean "+b);
          
          //read and return the byte value System.out.println("enter byte value"); byte
          byte bt=sc.nextByte(); 
          System.out.println("Print byte "+bt);
         
        //reading the one word
        
          System.out.println("enter  String"); 
          String str=sc.next(); //read the string and terminate on the space also
          System.out.println("Print String "+str);
         
        //reading the line
        //reading the one word
        //it will read the space and terminate on the enter or next line
        
          System.out.println("enter  Line"); String str1=sc.nextLine();
          System.out.println("Print Line "+str1);
         
        
        //reading the single char
        System.out.println("Enter the char");
        //it is method of string class
        //it takes the index value 
        //return char located on index value
        char c= sc.next().charAt(0);
        System.out.println(c);
    }
}
 