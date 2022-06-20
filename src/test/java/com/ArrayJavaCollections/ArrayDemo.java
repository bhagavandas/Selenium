package com.ArrayJavaCollections;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] myArray = {10,20,30,40};
		
		String[] StrArray = new String[4];
		int[] Array = new int[5];
		
		StrArray[0] = "nani";
		System.out.println(Arrays.toString(StrArray));
		Array[0] = 25;
		System.out.println(Arrays.toString(Array));
		
		
		int[] newArray = myArray;
		System.out.println("existing array = "+ Arrays.toString(myArray));
		System.out.println("new array = "+ Arrays.toString(newArray));
		
		int c[] = {1,2,3,4,5};
		
		int d[] = new int [c.length];
		for (int i = 0; i < d.length; i++) {
			d[i]=c[i];
			System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(d));
		
			//clone
			 int[] e = {1, 2, 3};      
		      int[] f = e.clone();
		 
		      System.out.print("Array e: ");
		      System.out.println(Arrays.toString(e));
		      System.out.print("Array f: ");
		      System.out.println(Arrays.toString(f));
			
		      //Copy array using arraycopy
		      int[] g = {1, 2, 3};      
		      int[] h = new int[g.length];
		      //System.arraycopy(g, 0, h, 0, h.length);
		      System.out.println("g : "+Arrays.toString(g));
		      System.out.println("h : "+Arrays.toString(h));
			
			
		}
		
		
	}
	
	
}
