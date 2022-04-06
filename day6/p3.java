package com.capgemini.day6;

public class p3 {
	public class Student {
	    
	    private int id;
	    private String name;
	    private String fees;

	 

	    public Student(int id, String name, String fees) {
	        this.id = id;
	        this.name = name;
	        this.fees = fees;
	    }
	    
	    public int getId() {
	        return id;
	    }

	 

	    public void setId(int id) {
	        this.id = id;
	    }

	 

	    public String getName() {
	        return name;
	    }

	 

	    public void setName(String name) {
	        this.name = name;
	    }

	 

	    public String getFees() {
	        return fees;
	    }

	 

	    public void setFees(String fees) {
	        this.fees = fees;
	    }

	 

	    @Override
	    public String toString() {
	        return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	    }

	 

	    
	}
}
