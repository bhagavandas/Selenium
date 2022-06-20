package com.CreateUser;

public class ReverseString {
public static void main(String[] args) {
	String val = "in";
	char[] c = val.toCharArray();
	
	for(int i=0; i< c.length; i++) {
		for(int j=1+i; j<c.length; j++) {
			if(c[i]== c[j]) {
				System.out.print(c[j]+", ");
				break;
			}
		}
	}
	
}
}

