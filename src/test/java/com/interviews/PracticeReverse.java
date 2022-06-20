package com.interviews;

public class PracticeReverse {
public static void main(String[] args) {
	String val = "25255289";
	String Reverse = "";
	for ( int i= val.length()-1; i>=0; i--) {
		Reverse = Reverse+ val.charAt(i);
		
	}
	System.out.println("Original String = "+val);
	System.out.println("Reversed string = "+Reverse);
}
}
