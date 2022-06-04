package com.pagesource;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Load the website
		driver.get("http://www.naukri.com/");

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		Set<String> childWindows = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> iteration = childWindows.iterator();

		while (iteration.hasNext()) {

			String child_window = iteration.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		}
		// switch to the parent window
		driver.switchTo().window(parent);
//	example :
		/*
		 * if (2 != 4) { System.out.println("x and y are not equal."); } else {
		 * System.out.println("x and y are equal."); }
		 */
		/*
		 * String a = "ssss"; String b = "ddd";
		 * 
		 * if(!a.equals(b)) { System.out.println("It is not the same car"); }
		 */

	}
}
