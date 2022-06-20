package com.interviews;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownElements {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://fb.com/");
	//click on create account button
	driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(3000);
	WebElement date = driver.findElement(By.id("day"));
	
	Select ds= new Select(date);
	
	ds.selectByValue("23");
	System.out.println("date - " + date.getText());
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.id("month"));
	Select sd= new Select(month);
	sd.selectByValue("10");
	System.out.println("Months - " + month.getText());
	
}
	
	
}

