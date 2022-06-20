package com.interviews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		Youtube();

	}
	public static void Youtube() {
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("search")).click();
		driver.findElement(By.xpath("//*[@id=\"button\"]/yt-icon")).sendKeys("Kommu Dayakar");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon/svg")).click();
		System.out.println(driver.getTitle());
	}
}
