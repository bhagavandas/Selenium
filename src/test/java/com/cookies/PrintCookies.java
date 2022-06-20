package com.cookies;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintCookies {
	@Test
	public void deleteCookies() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		Set<Cookie> sd = driver.manage().getCookies();
		for (Cookie c : sd) {
			System.out.println("cookie : " +c.getDomain()+ c.getName()+c.getValue());
		}
	}
}
