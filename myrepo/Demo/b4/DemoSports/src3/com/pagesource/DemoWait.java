package com.pagesource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWait {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = driver.findElement(By.id("myDynamicElement"));

	}

}
