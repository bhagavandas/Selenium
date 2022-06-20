package com.YoutubeClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLaunch {
	static WebDriver driver;
	// HOW TO OPEN MULTIPLE WEBSITES
	@Test
	public static void Launch() {
		
		driver.get("https://www.facebook.com/");
		
	}
	public static void Launch2() {
		driver.get("https://www.google.com/");
	}
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Launch();
		Launch2();
	}
}
