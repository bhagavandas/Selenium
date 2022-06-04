package com.sports.criclket;

public class DemoCricket3 {

	public static void main(String[] args) {
		System.out.println("hello Selenium!");

		DemoCricket3 obj = new DemoCricket3(); // 
		obj.login();
		leave();
//		obj.adminTab();
//		obj.addUser();
//		obj.logout();

	}
	
	public DemoCricket3() {
		System.out.println("this is constructor");
	}

	public static void leave() {
		System.out.println("login method");
		//add code for login
	}
	
	/*
	 * public String leave2() { System.out.println("login method"); //add code for
	 * login
	 * 
	 * return "3"; }
	 */
	
	public void login() {
		System.out.println("login method");
		//add code for login
	}

	public void adminTab() {
		System.out.println("go to admin tab");
	}

	public void addUser() {
		System.out.println("create new user");
	}

	public void logout() {
		System.out.println("user logout");
	}

}
