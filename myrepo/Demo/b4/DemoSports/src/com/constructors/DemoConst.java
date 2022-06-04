package com.constructors;

public class DemoConst {

	public DemoConst() { // this is constructor
		System.out.println("this is same name as class name"); // 
	}
	
	public DemoConst(String name) {
		System.out.println("this is same name as class name" + name);
	}
	
	
	public DemoConst(String name, int exp) {
		System.out.println("this is same name as class name : " + name + " - exp : "+ exp);
	}

	public void test1() {
		System.out.println("this is test1 method");
	}

	public void test2() {
		System.out.println("this is test2 method");
	}

	public static void main(String[] args) {
		DemoConst obj = new DemoConst(); // creating object
		
		
		System.out.println("he");
		obj.test1(); // calling method with object reference 
		
		DemoConst obj2 = new DemoConst("selenium", 14);
		// created another object to call parameterized constructor.
		

	}
}
