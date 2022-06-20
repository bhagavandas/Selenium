package com.interviews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintData {
public static void main(String[] args) {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.javatpoint.com/");
	driver.findElement(By.linkText("Selenium")).click();
	WebElement data = driver.findElement(By.id("menu"));
	System.out.println(data.getText());
}
}
