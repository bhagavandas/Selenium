package com.PrintListData;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javatpoint1 {
@Test
public void PrintTaglineData() {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.javatpoint.com/");
	 List<WebElement> dropdownElement = driver.findElements(By.xpath("//*[@class='ddsmoothmenu']"));
	for(WebElement subtitlebar : dropdownElement) {
		System.out.println(subtitlebar.getText() );
	}
	
	
	
	
}
}
