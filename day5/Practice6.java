package com.capgemini.day5;

public class Practice6 {
	public static void main(String[] args) {
		
        String s = "Neha"; 
        String s1 = new String("Neha");
        String s2="Sohani";
        
        if (s.equalsIgnoreCase(s1)) // It will compare the value and datatype
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }
        //(p.compareTo(q));// Compare two string o/p= -5
        String p = "A";
        String q = "F";
        System.out.println(p.compareTo(q)); 
        
        s.charAt(1); //It will take the index and return the char
    	System.out.println(s.charAt(1));
    	
    	s.concat(s2); // combine two string using concate
    	System.out.println(s.concat(s2));
        
    	s.contains("ha"); // it will search for string in given string o/p will true or false
    	System.out.println(s.contains("ha"));
    	
    	byte[] b = s.getBytes(); // convert the string to byte array
    	//System.out.println(byte[] b = s.getBytes());
    	
    	s.indexOf("e");// it will take the char and return the index
    	System.out.println(s.indexOf("e"));
        
    	
	}
}
