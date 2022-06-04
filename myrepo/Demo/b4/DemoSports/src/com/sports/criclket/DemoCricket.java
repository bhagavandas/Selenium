package com.sports.criclket;

import org.testng.annotations.Test;

public class DemoCricket {


	public String lang = "java";
	public static int sal = 50000;
	
	@Test
	public static void test1() {
		String name = "iqst";			
		DemoCricket ss = new DemoCricket();
		System.out.println(ss.lang);

	}

	
	@Test
	public void test2() {

		System.out.println(lang + sal);
		String course = "selenium";
		

	}

}
