package com.SikuliDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsDemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	ChromeOptions options = new ChromeOptions();

	options.addArguments("--disable-notifications");
	
	String username = "admin";
	// Set the password
	String password = "admin";
	driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");
	driver = new ChromeDriver(options);
	

	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	driver.close();
}
}
