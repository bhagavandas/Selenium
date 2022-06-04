package com.selenium.commands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://demoqa.com/browser-windows";
		// Load the website
		driver.get(url);

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		System.out.println("parent window : " + parent);

		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		
//		driver.quit();

//		List allows duplicate values. Set should not allow the duplicate values in java

		Set<String> windows = driver.getWindowHandles(); //including main window along with child windows

		System.out.println(windows.size());

		Iterator<String> iteration = windows.iterator();

		while (iteration.hasNext()) {

			String child_window = iteration.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

//				System.out.println("child window title : "+driver.switchTo().window(child_window).getTitle());
				
				System.out.println("child winodw id : "+child_window);
				

				driver.close();
			}

		}
	}
}
