package com.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		// application login page launched
		driver.get(url);

		DemoSelect obj = new DemoSelect();
		obj.login();

		obj.clickAdmin();

		driver.findElement(By.id("btnAdd")).click();

		WebElement we = driver.findElement(By.id("systemUser_userType"));
		Select se = new Select(we);

		System.out.println("number of options in the User Role list : " + se.getOptions().size());

		
		se.selectByValue("2");
		
		Thread.sleep(3000);
		se.selectByVisibleText("Admin");
		Thread.sleep(3000);
		se.selectByIndex(1);
		
		

	}

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

	public void clickAdmin() {
//		css
		WebElement tab_Admin = driver.findElement(By.cssSelector("#menu_admin_viewAdminModule"));
		tab_Admin.click();
	}

}
