package com.capgemini.day2;

public class AlphabetVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 char ch = 'n';

	        switch (ch) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(ch + " is vowel");
	                break;
	            default:
	                System.out.println(ch + " is consonant");
	        }
	}

}
