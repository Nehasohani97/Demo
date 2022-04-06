package com.capgemini.helloworld;

enum Day{
	Sunday, Monday, Tuesday, Wednusday, Thurseday, Friday, Satureday
}


enum Month{
	January, February, March, April, May, June, July
}



public class MyEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Day.Monday);
		System.out.println(Day.Sunday);
		
		System.out.println(Month.January);
		System.out.println(Month.valueOf("May"));
	}

}

