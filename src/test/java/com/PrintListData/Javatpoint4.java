package com.PrintListData;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javatpoint4 {
	@Test
	public void SeleniumListPrint() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		driver.findElement(By.xpath("//*[@alt='selenium']")).click();
		List<WebElement> dropdown = driver.findElements(By.id("menu"));
		for(WebElement sd : dropdown) {
			System.out.println(sd.getText());
		}
	}
}