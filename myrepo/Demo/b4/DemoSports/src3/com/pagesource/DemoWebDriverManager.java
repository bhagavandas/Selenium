package com.pagesource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DemoWebDriverManager {

	public static void main(String[] args) {
		
		//webdriver driver declaration
		
		//sys set property to give browser driver path
		//download the specific browser driver ( exe format ) .. zip file downloaded / unzip / 
		//we have to download all types of browsers 
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://www.fb.com");
//		
//		
//	WebDriverManager.firefoxdriver().setup();
//		
//		WebDriver driver3 = new FirefoxDriver();
//		
//		driver3.get("http://www.fb.com");
		
		
	WebDriverManager.edgedriver().setup();
		
		WebDriver driver2 = new EdgeDriver();
		
		driver2.get("http://www.fb.com");
		

		
		
		
	}
	
}
