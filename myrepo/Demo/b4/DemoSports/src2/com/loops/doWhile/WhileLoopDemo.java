package com.loops.doWhile;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int id = 12;

//		If condition satisfies then it will execute the statement inside the while loop.
		while (id < 15) {
			System.out.println(id);
			break;// if you don;t use break then it will execute infinity times.
		}

		int num = 10;

		while (num < 15) {
			System.out.println(num);
			num++;
		}
	}
}
