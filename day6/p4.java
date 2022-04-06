package com.capgemini.day6;

public class p4 {

	public class Student implements Comparable<Student> {
	    
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

	 

	    @Override
	    public int compareTo(Student s1) {
	        // TODO Auto-generated method stub
	        /*
	         * if(this.getId()>s1.getId()) { return 1; } else if(this.getId()<s1.getId()) {
	         * return -1; } else { return 0; }
	         */
	        //string
	        return this.getName().compareTo(s1.getName());
	    }

	 

	    
	}
	 
}
