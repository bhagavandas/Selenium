package com.ParallelTestingDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrallelClassDemo1 {
	WebDriver driver;

	@Test
	public void testParallelDemo1() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://www.fb.com");
		driver.close();
	}

}

