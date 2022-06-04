package com.polymorphism;

class ABC2 {
	public void myMethod() {
		System.out.println("Overridden method");
	}
}

class Demo2 extends ABC2 {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method");
	}

	public static void main(String args[]) {
		Demo2 obj = new Demo2();
		obj.myMethod();
	}
}