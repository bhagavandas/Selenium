package com.CompareStrings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonList {
@Test
public void test() throws InterruptedException {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	 driver.findElement(By.xpath("//*[@class='hm-icon-label']")).click(); // click all
	 List<WebElement> dropdownElement = driver.findElements(By.xpath("//*[@class='hmenu hmenu-visible']/li"));
	
	for (WebElement option : dropdownElement) {
		System.out.println(option.getText() );
	
	}	
}
}
