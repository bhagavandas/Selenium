package com.pagesource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPageSource {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		driver.get("https://www.scientecheasy.com/2020/07/selenium-webdriver-commands.html/");
//		String p1 = driver.getPageSource();
//		System.out.println("Page Source is : " + p1);

		WebElement l = driver.findElement(By.tagName("body"));
		String p = l.getText();
		
//		WebElement k = driver.findElement(By.tagName("html"));
//		String p2 = k.getText();
//		System.out.println("Page Source is : " + p2);
		
		System.out.println("Page Source is : " + p);
		
//		if( p.contains("UPSC Notes")) {
//			System.out.println("sasi");
//		}else System.out.println("no ");
	
		
//		This is most popular one to fulfill our requirement. but the result that come is in Boolean
		

				
				
	}
}
