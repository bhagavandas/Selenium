package com.ScreenshotfailTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
WebDriver driver;
	
	public void browserSetUp() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://www.fb.com");
	}
	
	public void loginTest() {
		System.out.println(driver.getTitle());
	}
	
	public void failedTest() throws IOException {
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File(".\\screenshots\\"+this.getClass().getName()+".png"));
	}
	
//	@Test
//	public void test() throws IOException {
//		browserSetUp();
//		loginTest();	
//		failedTest();
//	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("hello");
		Demo1 ss = new Demo1();
		ss.browserSetUp();
		ss.loginTest();
		ss.failedTest();
		
		
	}
}


