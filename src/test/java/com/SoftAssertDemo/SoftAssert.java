package com.SoftAssertDemo;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert {
static WebDriver driver;
static String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

@BeforeMethod
public void setup() {
	// webdriver manger setup to use the browser driver.
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	//driver.manage().window().maximize();
	// launch the application.
			driver.get(url);
}
@Test(description = "This is sample test")
public void test() {
	String ActualTitle = driver.getTitle();
	//System.out.println(ActualTitle);
	String verifyAssertNull = null;
	String ExpectedTitle = "orange HRM";
	Boolean verifyTitleIsPresent = driver.getTitle().equalsIgnoreCase("HRM");
	Boolean verifyTitleIsChanged = driver.getTitle().equalsIgnoreCase("Orange HRM");
	
	SoftAssert sf = new SoftAssert();
	//Assert.assertEquals(ExpectedTitle, ActualTitle);
	Assert.assertNotEquals(ExpectedTitle, "HRM");
	
	
	
}
}
