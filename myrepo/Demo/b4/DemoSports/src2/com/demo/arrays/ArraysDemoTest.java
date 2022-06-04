package com.demo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ArraysDemoTest {

	public static void main(String[] args) {
		

		int x[] = new int[5]; // creating fixed int array
		System.out.println(Arrays.toString(x));
		x[1] = 0; // assigning value in the index 0 ( first value )
		System.out.println(Arrays.toString(x));
		
		double y[] = new double[6];// creating fixed double array
		y[0] = 7.008; // assigning value in the index 0 ( first value )
		System.out.println(Arrays.toString(y));
		
		char c[] = new char[5]; // creating fixed char array
		c[2] = 's'; // assigning value in the index 2 ( 3rd value )
		System.out.println(Arrays.toString(c));
		
		
		
		
		
		ArrayList<String> CourseNames = new ArrayList<String>();
		Scanner inputvalue = new Scanner(System.in);
		for(int crs=1; crs<5; crs++) {
		System.out.println("Please enter your course name : ");
			String ss = inputvalue.nextLine();
			CourseNames.add(ss);
		}
		System.out.println("Our course list : "+CourseNames);
		/*
		ArrayList<Integer> i = new ArrayList<Integer>();

		ArrayList<Double> d = new ArrayList<Double>();

		CourseNames.add("selenium");
		i.add(5);
		d.add(5.56);

		// get the input value from user
		Scanner inputvalue = new Scanner(System.in);

		System.out.println("please nter a value : ");
		String ss = inputvalue.nextLine();

		System.out.println("you entered : " + ss);

		int nn = inputvalue.nextInt();
		

		System.out.println("you entered : " + nn);
*/
		
		
		
	}
}
