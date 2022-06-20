package com.YoutubeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageHRM {
	@Test
	public void LoginPage() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement U_Name = driver.findElement(By.id("txtUsername"));
		//For entering username we use sendkeys command
		U_Name.sendKeys("Admin");
		WebElement U_Pwd = driver.findElement(By.id("txtPassword"));
		U_Pwd.sendKeys("admin123");
		//check whether the username and password entered or not
		WebElement Login = driver.findElement(By.id("btnLogin"));
		Login.click();  // click on login button
		//Now run the test
		//Now it will login successfully and will open dashboard page

	}
}
