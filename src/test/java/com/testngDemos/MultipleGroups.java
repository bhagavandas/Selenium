package com.testngDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleGroups {
	
	@Test(groups = "checkintest" )
	
	public void testMethod1() {
		System.out.println("this is method 1");
	}
	
	
	@Test(groups = "broken")
	public void LoginMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("Login method");
		//driver.findElement(By.id("txtUsername")).sendKeys("username")
		
	}	
	}

	
	

