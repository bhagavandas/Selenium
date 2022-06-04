package com.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActiveElement {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		/*
		 * driver.navigate().to(
		 * "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 * driver.navigate().back(); driver.navigate().forward();
		 * driver.navigate().refresh();
		 * 
		 * 
		 * // identify element WebElement btn = driver.findElement(By.id("btnLogin"));
		 * // activeElement() to verify element focused if
		 * (btn.equals(driver.switchTo().activeElement()))
		 * System.out.println("Element is focused"); else {
		 * System.out.println("Element is not focused"); }
		 */
		
		
		driver.navigate().to("https://www.google.com");
	

	
		// identify element
		WebElement gSearch = driver.findElement(By.name("q"));
		// activeElement() to verify element focused
		if (gSearch.equals(driver.switchTo().activeElement()))
			System.out.println("Element is focused");
		else
			System.out.println("Element is not focused");

	}
}
