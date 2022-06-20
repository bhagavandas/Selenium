package com.ArrayJavaCollections;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTextSelectedNot {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		try {
		    driver.findElement(By.xpath("//input[@class='textfield form-control servicefield invItem_dynamic_validation valid' and not(disabled)][@controlid='txtIPAddress']"));
		    System.out.println("Element is enabled");
		} catch (NoSuchElementException e) {
		    System.out.println("Element is not enabled");
		}
		
		
		
		
	}
	
	
	
	
}
