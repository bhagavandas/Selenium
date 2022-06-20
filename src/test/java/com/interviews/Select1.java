package com.interviews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("BhagavanDas");
		
		//Here we use Thread.sleep or wait method
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='firstname']")));
		//Category_Body.sendKeys("Bhagavan");
		WebElement sd = driver.findElement(By.id("month"));
		Select month = new Select(sd);
		month.selectByValue("6");
		System.out.println(sd.getText());
	}
}
