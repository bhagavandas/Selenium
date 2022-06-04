package com.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class DemoGetCss {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		WebElement btn = driver.findElement(By.id("btnLogin"));

		String color = btn.getCssValue("color");

		System.out.println("button color by using getcss value : " + color);
		
		String c = Color.fromString(color).asHex();
	
		System.out.println("Hex code for color:" + c);

	}

}
