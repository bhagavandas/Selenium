package com.demo.arrays;

import java.util.ArrayList;
import java.util.Scanner;

//Get data from keyboard and save in the3 array list.
public class GetDataFRomKeyboard {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<String> username = new ArrayList<String>();

		ArrayList<String> password = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			System.err.println("Please enter user name : ");
			username.add(s.nextLine());
			System.out.println("Please enter password : ");
			password.add(s.nextLine());

		}
		System.out.println(username + ": " + password);
	}
}
