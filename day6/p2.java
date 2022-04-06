package com.capgemini.day6;

import java.util.ArrayList;
public class p2 {

	
    public static void main(String[] args) {
	        
	        ArrayList<Student> ls=new ArrayList<Student>();
	        p2 s1=new p2(1, "Zee","1000");
	        p2 s2=new p2(3, "kumar","500");
	        p2 s3=new p2(5, "priya","7000");
	        p2 s4=new p2(7, "komal","8000");
	        p2 s5=new p2(10, "umesh","2000");
	        
	        ls.add(s1);
	        ls.add(s2);
	        ls.add(s3);
	        ls.add(s4);
	        ls.add(s5);
	        
	        //System.out.println(ls);
	        for(Student e:ls)
	        {
	            System.out.println(e);
	        }
	        
	        //Sort the user defined data type
	    }

	 

	}
}
