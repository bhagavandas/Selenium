package com.parameterization;

import com.sports.criclket.DemoCricket2;

public class Demo1 implements DemoCricket2 {

	public static void main(String[] args) {
		login("uday");
		// create user
		// logout

		int age = 50;

		System.out.println(age);
		login("dasarath");
		// logout
		Demo1 obj = new Demo1();
		obj.add();
	}

	public static void login(String name) {
		System.out.println("Name : " + name);
	}

	@Override
	public void createUser() {
		// TODO Auto-generated method stub

	}

	public void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;

	}

}
