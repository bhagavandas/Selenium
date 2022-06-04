package com.pagesource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiveElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println(System.getProperty("user.dir"));
		try {
			driver.get("file:///"+System.getProperty("user.dir")+"/htmlFiles/multiselectorList.html");

			WebElement list = driver.findElement(By.id("cars"));
			Select se = new Select(list);
			se.isMultiple();
			
			
		
			se.selectByIndex(1);
			se.selectByIndex(2);
			se.selectByIndex(3);

			Thread.sleep(5000);

			se.deselectAll();
			Thread.sleep(5000);
			
			se.selectByIndex(1);
			se.selectByIndex(2);
			se.selectByIndex(3);
			se.selectByIndex(0);
			Thread.sleep(5000);
			
			se.deselectByIndex(2);
		
			Thread.sleep(5000);

		} finally {
//			driver.quit();
			System.out.println("helllo");
		}
	}
}