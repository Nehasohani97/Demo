package com.capgemini.day6;

public class p6 {
	import java.util.Comparator;

	 

	public class SortByID implements Comparator<Student> {

	 

	    @Override
	    public int compare(Student s1, Student s2) {
	        
	        if(s1.getId()>s2.getId())
	        {
	            return -1;
	        }
	        else if(s1.getId()>s2.getId())
	        {
	            return 1;
	        }
	        else
	        {
	        return 0;
	        }
	    }
	    
	    

	 


}
