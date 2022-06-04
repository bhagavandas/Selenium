package com.conditionalStatements;

/*
 * here we are checking conditions with switch case 
 */
public class DemoSwitch {
	public static void main(String[] args) {
		
		String browser ="chrome";
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
				System.out.println("Google chrome browser");
		}			
			
	}
}
