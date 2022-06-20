package com.CreateUser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintEachElement {
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://fb.com");

		driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();
		Thread.sleep(3000);

		WebElement el = driver.findElement(By.name("birthday_month"));

		Select se = new Select(el);
		se.selectByIndex(3);

		List<WebElement> li = driver.findElements(By.xpath("//select[@id='month']/option"));

		System.out.println(li.size());
		
		
		for (int i = 1; i <= li.size(); i++) {

			System.out.println(driver.findElement(By.xpath("//select[@id='month']/option["+i+"]")).getText() + " : "+driver.findElement(By.xpath("//select[@id='month']/option["+i+"]")).getAttribute("value") );
			
			driver.findElement(By.xpath("//select[@id='month']/option["+i+"]")).click();
			Thread.sleep(5000);
		}

		

	}
}
