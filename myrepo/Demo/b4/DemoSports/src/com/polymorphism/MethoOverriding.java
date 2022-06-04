package com.polymorphism;

public class MethoOverriding  extends MOVRParent{
	
	
	public void testLogin() {
		System.out.println("this is from overridden from child");
	}
	
	public static void main(String[] args) {
		MethoOverriding obj = new MethoOverriding();
		
		obj.testLogin();
		
//		MOVRParent obj2 = new MOVRParent();
//		
//		obj2.testLogin();
	}

}
