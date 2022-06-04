package com.java.conditionalStatements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DemoIf {

	public static WebDriver driver;

	public static void main(String[] args) {
		String browser = "Ff";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome browser");
//			System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
//
//			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ff")) {
			System.out.println("ff browser");
//			System.setProperty("webdriver.firefox.driver", ".\\BrowserDrivers\\geckodriver.exe");
//
//			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("edge browser");
//			System.setProperty("webdriver.edge.driver", ".\\BrowserDrivers\\edge.exe");
//
//			driver = new EdgeDriver();
		} else {
			System.out.println("browser name not matched");
//			System.setProperty("webdriver.safari.driver", ".\\BrowserDrivers\\sfariDriver.exe");
//
//			driver = new SafariDriver();
		}
//		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		// application login page launched
//		driver.get(url);

	}
}
