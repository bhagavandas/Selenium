package com.java.conditionalStatements;

import org.openqa.selenium.WebDriver;

public class DemoSwitch {
	public static WebDriver driver;

	public static void main(String[] args) {
		String browser ="Chrome";
		switch (browser) {
		case "chrome":
			System.out.println("Open Google Chrome browser");
			break;
		case "firefox":
			System.out.println("Open Firefox browser");
			break;
		case "edge":
			System.out.println("Open edge browser");
			default:
				System.out.println("no browser name");
		}		
	}
	
}
