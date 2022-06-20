package com.interviews;

public class StringReversePrint {
public static void main(String[] args) {
	String name = "25458514";
	String Reverse = "";
	for(int i = name.length()-1; i>=0; i--) {
		Reverse = Reverse + name.charAt(i);
	}
	System.out.println(Reverse);
}	
}