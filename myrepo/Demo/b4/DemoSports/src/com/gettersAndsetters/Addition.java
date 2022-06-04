package com.gettersAndsetters;

public class Addition {
	private int x, y, z;

	public void setX(int a) {
		x = a;
	}

	public void setY(int b) {
		y = b;
	}

	public void setZ(int c) {
		z = c;
	}

	void sum() {
		int s = x + y + z;
		System.out.println("Sum: " + s);
	}
}
