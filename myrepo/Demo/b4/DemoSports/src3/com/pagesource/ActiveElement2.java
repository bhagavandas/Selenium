package com.pagesource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("http://www.google.com");
			driver.findElement(By.cssSelector("[name='q']")).sendKeys("webElement");

			// Get attribute of current active element
			String attr = driver.switchTo().activeElement().getAttribute("title");
			System.out.println(attr);
		} finally {
			driver.quit();
		}
	}
}