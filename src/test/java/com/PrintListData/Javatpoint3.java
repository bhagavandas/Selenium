package com.PrintListData;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javatpoint3 {
	@Test
	public void PrintData() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		driver.findElement(By.linkText("Java")).click();
		//driver.findElement(By.xpath("//*[@class='selected']")).click(); 
		List<WebElement> sd = driver.findElements(By.id("menu"));
		for(WebElement dropdownElements : sd ) {
			System.out.println(dropdownElements.getText());
		}
	}
	}

