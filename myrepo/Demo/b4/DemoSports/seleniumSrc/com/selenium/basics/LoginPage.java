package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public void login() {
		String UserName = "Admin";
		String Password = "admin123";
		WebElement u_Name = driver.findElement(By.id("txtUsername"));
		WebElement u_Pwd = driver.findElement(By.name("txtPassword"));
		WebElement login_Btn = driver.findElement(By.id("btnLogin"));
		u_Name.clear();
		u_Name.sendKeys(UserName);
		u_Pwd.clear();
		u_Pwd.sendKeys(Password);
		login_Btn.click();
	}
}
