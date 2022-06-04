package com.loops.doWhile;

public class ForLoopDemo {
	public static void main(String[] args) {
		int x;

		for(x=10; x<20; x++) {
			System.out.println("value of x :"+ x);
		}

		// use break to stop the execution in the for loop if any condition satisfies;
		for(int y=10; y<20; y++) {
			if(y==18) 
				break;
			System.out.println("value of y :"+ y);
			
			
		}

//

		for (int z = 10; z < 20; z++) {
			if (z == 17)
				continue;
			System.out.println("value of z :" + z);
		}
		
		

	}

}
