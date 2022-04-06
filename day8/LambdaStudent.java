package com.capgemini.day8;

@FunctionalInterface // functional interface which have only one method
interface StudetDetails {
	public void student();
}

interface StudentId {
	public void id(int p);
}

interface StudentName {
	public void name(String nm);
}

public class LambdaStudent {
	public static void main(String[] args) {

		// interfacename
		StudetDetails a = () -> System.out.println("Welcom to Student Info");
		a.student(); // to get the result
		
		StudentId b = (int p) -> System.out.println("Student Id is "+p);
		b.id(45);
		
		StudentName c = (String nm) ->System.out.println("Student Name "+nm);
		c.name("neha");
	}
}
