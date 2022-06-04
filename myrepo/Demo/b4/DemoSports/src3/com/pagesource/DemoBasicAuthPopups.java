package com.pagesource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBasicAuthPopups {
	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", path + "\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// send username : admin and password: admin in url before launching the browser
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		// validate if popup is closed successfully and capture the text

		WebElement successMessage = driver.findElement(By.xpath("//div[@class='example']//p"));

		System.out.println(successMessage.getText());
	}
}
