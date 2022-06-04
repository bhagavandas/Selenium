package com.polymorphism;

public class MethodOverloadingDemo {

	public void login() {
		System.out.println("Hi User : ");
	}

	public void login(String userName) {
		System.out.println("my name : " + userName);
	}
	public void login(String userName, String course) {
		System.out.println("my name : " + userName + " - my Course name : "+ course);
	}
	public void login(String emp, int sal) {
		System.out.println("my name : " + emp + " - my sal : "+ sal);
	}
	public void login(int sal) {
		System.out.println("my sal : " + sal);

	}

	public static void main(String[] args) {
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.login();
		obj.login("sasi");		
		obj.login("sasi", "selenium");
		obj.login(999999);
		obj.login("assi", "ssss");
		
		
	}
}
