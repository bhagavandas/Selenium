package com.interviews;

public class ArraySum {
	public static void main(String[] args) {
    int arr[] = {5,2,8,6,4};
    int sum=0;
    int product = 1;
    
    for (int i = 0; i<arr.length; i++) {
    	sum= sum + arr[i];
    	product = product * arr[i];
    }
    	System.out.println("product of values = " + product);
    System.out.println("sum of values = " + sum);
	}
}
