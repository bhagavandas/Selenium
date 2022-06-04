package com.reusable;

public class DemoPrivate {

	private  int sal= 50000;
	private  String name = "abc";
	
	public String game = "Cricket";
	
	
	public static void main(String[] args) {
		DemoPrivate obj = new DemoPrivate();
		System.out.println("Name: "+ obj.name + "  - Sal : " + obj.sal );
	}
	
	
}
