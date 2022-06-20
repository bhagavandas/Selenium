package com.ArrayJavaCollections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbData2 {

//@Test

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// click Create account link/button
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();

//To get all the dropdown values you can use List.
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("month")));
		driver.findElement(By.id("month")).click();

		List<WebElement> d = driver.findElements(By.xpath("//select[@id='month']/option"));

		System.out.println(d.size());
		System.out.println();

	}
}
