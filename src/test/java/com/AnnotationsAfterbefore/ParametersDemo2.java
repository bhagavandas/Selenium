package com.AnnotationsAfterbefore;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo2 {
	@Parameters({ "name", "name2", "id" })
	@Test
	public void testSingleString( String idvalue, String dd, String firstName) {
	  System.out.println("Invoked testString " + firstName);
	  System.out.println("Invoked testString " + dd);
	  System.out.println("Invoked testString " + idvalue);
	  
	}
	
	
	
	

}
