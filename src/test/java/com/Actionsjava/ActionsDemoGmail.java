package com.Actionsjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemoGmail {
	WebDriver driver;
@Test
public void test() throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	//navigate url
	driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	
	Actions ActionProvider = new Actions(driver);
	
	WebElement gmailLink = driver.findElement(By.cssSelector("a>.mobile-before-hero-only"));
	ActionProvider.moveToElement(gmailLink).build().perform();
	Thread.sleep(2500);
	
	driver.navigate().to("https://www.amazon.in/");
	WebElement we = driver.findElement(By.id("nav-cart-text-container"));
	ActionProvider.moveToElement(we).build().perform();
	
	
	
		
		
	}
	
}

