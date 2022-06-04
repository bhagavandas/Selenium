package com.trail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotrail extends Trail2 {

	
	 WebDriver driver;
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		test2(driver);
	}
	
	
	
	
}
