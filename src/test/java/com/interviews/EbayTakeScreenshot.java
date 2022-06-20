package com.interviews;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayTakeScreenshot {
	WebDriver driver;
	@Test
	public void EbayLaunch() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//enter jbl speakers
		driver.findElement(By.name("_nkw")).sendKeys("JBL Speakers");
		//clicking the search button
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@class='s-item__image-img']")).click();
		
		//driver.findElement(By.linkText("JBL Flip 5 Portable Waterproof Bluetooth Speaker")).click();
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File(".\\screenshots\\" + "ebays.png"));
		
		
		//File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screen, new File(".\\screenshots\\" + "ebay.png"));

	}
	
	

}
