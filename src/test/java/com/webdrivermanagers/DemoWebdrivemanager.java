package com.webdrivermanagers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebdrivemanager {
public static void main(String[] args) {
	//WebDriver driver declaration 
	//system.setproperty to give browser driver path
	//creating an object to access driver class
	WebDriverManager.chromedriver().setup();
	
}
}
