package com.RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtondemo {
	@Test
	public void test() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
WebDriverWait wait = new WebDriverWait(driver,10);

	WebElement btn_createAccount = driver.findElement(By.xpath("//*[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']"));
	
	btn_createAccount.click();
	System.out.println("it is clicked");
	




	}
}
