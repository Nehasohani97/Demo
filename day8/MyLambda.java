package com.capgemini.day8;

	//functional interface which have only one method
	@FunctionalInterface
	interface Lambda {
	    // method with parameters
	    public void print();
	}
	interface SumInterface {
	    public void sum(int a, int b);
	}
public class MyLambda {
	    public static void main(String[] args) {
	    	
	        // Lambda expression--it is java 1.8 features
	        // it will force developer to do the functional programming
	        // print a message
	        // MyLambda.print();
	        // MyLambda.addingNumber(10, 20);
	        // before java 1.8 we can store only value to variable
	        int aa = 10;

	        // after java 1.8 you can store code in variable and execute later
	        // remove the public scope modifier because method will be stored in variable
	        // method will belong to variable now
	        // remove the return type also.it will understand retrun type from body
	        // remove the method name
	        // add the lambda symbol
	        // remove the braces
	        // method cannot stored in the integer type ..it required the interface type
	        
	        Lambda result = () -> System.out.println("Hello Java lambda");
	        result.print();

	        SumInterface sumInterface = (int a, int b) -> {

	            int c = a + b;
	            System.out.println(c);
	        };
	        
	        sumInterface.sum(10, 10);
	    }

	    public static void print() {
	        System.out.println("Hello Java");
	    }

	    public static void addingNumber(int a, int b) {
	        int c = a + b;
	        System.out.println(c);
	    }


	}

