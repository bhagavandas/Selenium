package com.AnnotationsAfterbefore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	
	@Test
	public void flow1() {
		System.out.println("this is method flow1");
	}
	
	@Test
	
	public void flow2() {
		System.out.println("this is method flow2");
	}
	
	@Test
	public void flow3() {
		System.out.println("this is method flow3");
	}
	@AfterMethod
	public void mafter() {
		System.out.println("this is after method");
	}
	
	@BeforeMethod
	public void mBefore() {
		System.out.println("this is before mehod");
	}
	
	
}
