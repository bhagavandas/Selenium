package com.interviews;

import java.util.Scanner;

public class PrintNextNumber {
	public static void main(String[] args) {
		int n = 35;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number :"+n);
		n = sc.nextInt();
		System.out.println("Next number (" + n + ") is:" + next(n));

	}

	static int next(int n) {
		return ++n;
	}
}
