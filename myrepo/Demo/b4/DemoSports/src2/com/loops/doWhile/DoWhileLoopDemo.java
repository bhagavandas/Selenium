package com.loops.doWhile;

public class DoWhileLoopDemo {
	public static void main(String[] args) {
		int x = 10;
		do {
			System.out.println("x value is : "+ x);
			x++;
//			break; // if you use break then it will stop the execution here in this function.
		}while ( x<=15);
		
		// decrement
		int y = 10;
		do {
			System.out.println("y value is : "+ y);
			y--;
		}while ( y>=5);
	}
}
