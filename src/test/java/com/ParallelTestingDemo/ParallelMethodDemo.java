package com.ParallelTestingDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelMethodDemo {
WebDriver driver;

@Test
public void TestParallelDemo1() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("http://www.fb.com");
	driver.close();
	
}
@Test
public void testParallelDemo2() {

	WebDriverManager.chromedriver().setup();

	driver = new ChromeDriver();

	driver.get("http://www.sudhafoundation.blogspot.com");
	driver.close();
}
@Test
public void testParallelDemo3() {

	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();

	driver.get("http://www.yahoo.com");
	driver.close();
}

@Test
public void testParallelDemo4() {

	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();

	driver.get("http://www.blogger.com");
	driver.close();
}

}


