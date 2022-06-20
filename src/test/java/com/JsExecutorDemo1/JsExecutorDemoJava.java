package com.JsExecutorDemo1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecutorDemoJava {
@Test
public void test() throws InterruptedException {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	JavascriptExecutor sd = (JavascriptExecutor) driver;
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	((JavascriptExecutor) driver).executeScript("document.getElementById('txtUsername').value='Admin';");
	Thread.sleep(2000);
	
	((JavascriptExecutor) driver).executeScript("document.getElementById('txtPassword').value='admin123';");
	
	sd.executeScript("document.getElementById('btnLogin').click();");
			
	
	sd.executeScript("history.go(0)"); 
	
	
}
}
