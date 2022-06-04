package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenChromeBrowser2 {
//
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
//		driver.get("http://www.google.com");
		driver.get(url);
		driver.manage().window().maximize();

//		What are the selenium locators 

		String UserName = "Admin";
		String Password = "admin123";

		WebElement u_Name = driver.findElement(By.id("txtUsername"));
		WebElement u_Pwd = driver.findElement(By.name("txtPassword"));
		WebElement login_Btn = driver.findElement(By.id("btnLogin"));

		u_Name.clear();
		u_Name.sendKeys(UserName);
		u_Pwd.clear();
		u_Pwd.sendKeys(Password);

//		login_Btn.click();

//		driver.findElement(By.linkText("Forgot your password?")).click();

		String forgot_pwd_url = driver.findElement(By.linkText("Forgot your password?")).getAttribute("href");

		System.out.println("LinkText : " + forgot_pwd_url);

		String forgot_pwd_url2 = driver.findElement(By.partialLinkText("Forgot your")).getAttribute("href");

		System.out.println("partial linktext url : " + forgot_pwd_url2);

		driver.findElement(By.partialLinkText("Forgot your")).click();

		String forgotPwd_url = driver.getCurrentUrl();

		System.out.println("page url : " + forgotPwd_url);

		String pageTitle = driver.getTitle();
		System.out.println("page title : " + pageTitle);
		
		WebElement btn1 = driver.findElement(By.id("btnSearchValues"));
		
		String value = btn1.getAttribute("value");
		
		System.out.println("button name : " + value);
		
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println("text : "+text);
		
		
		
//		driver.findElement(By.name())
//		driver.findElement(By.className())
//		driver.findElement(By.linkText())
//		driver.findElement(By.partialLinkText(url))
//		driver.findElement(By.tagName())
//		driver.findElement(By.cssSelector())
//		driver.findElement(By.xpath())

		// Locators

		// page title

		// get url for a link

		// get current url

		// GET TEXT

		// type

//		CLICK

		// select

//		driver.close();

//		driver.quit();
	}

}
