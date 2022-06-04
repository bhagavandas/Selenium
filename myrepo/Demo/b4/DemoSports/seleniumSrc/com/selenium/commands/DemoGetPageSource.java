package com.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class DemoGetPageSource {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		String pageSourceText = driver.getPageSource();
//		System.out.println(pageSourceText);
		
		if( pageSourceText.contains(" Username : Admin | Password : sasidhar ")) {
		System.out.println("text is available in the webpage");	
		}else System.out.println("Tesxt does not exists in the webpage.");
		

		

	}

}
