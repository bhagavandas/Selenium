package com.interviews;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {
public static void main(String[] args) {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.youtube.com/c/kommu dayakar/");
	String we = driver.getTitle();
	System.out.println(we);
	WebElement search = driver.findElement(By.xpath("//*[@id=\"search\"]"));
	search.click();
	search.sendKeys("Kommu Bhagavan Das");
	
	TakesScreenshot scrShot =((TakesScreenshot)search);
	
	//this.takeSnapShot(driver, "c://test.png") ; 
	
}
}
