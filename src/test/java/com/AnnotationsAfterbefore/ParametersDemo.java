package com.AnnotationsAfterbefore;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	
	
	@Parameters({"username"})
	@Test
	
public void Logintest(String username) {
		
	System.out.println("This is parameter value : "+ username);

	}	
}
