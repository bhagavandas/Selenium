package com.SikuliDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileDemo1 {
public static void main(String[] args) throws InterruptedException {
	
	String filepath = "E:\\Automation\\Game\\";
	
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	Thread.sleep(3000);
	Actions ac = new Actions(driver);
	WebElement e = driver.findElement(By.xpath("//input[@id='file-upload']"));
			ac.moveToElement(e).build().perform();
			e.sendKeys(filepath + "uploadfile.PNG");
			driver.findElement(By.id("file-submit")).click();
			Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(), "File Uploaded!");
			Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(), "uploadfile.png");
			System.out.println("Test Pass");

	
	
	
}
}
