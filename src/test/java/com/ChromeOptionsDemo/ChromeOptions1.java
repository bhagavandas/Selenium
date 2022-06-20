package com.ChromeOptionsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptions1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		options.addArguments("--disable-sotware updates");
		options.addArguments("disable-push-notifications");
		
	
		driver.get("https://1jiorockers.vip/movies/4757/telugu-2020-movies.html");
		driver.findElement(By.linkText("All Telugu 2020 Movies")).click();
		driver.getTitle();
		System.out.println("get title ");
		List<WebElement> ss = driver.findElements(By.xpath("/html/body"));
		ss.get(0);
		for(WebElement movies : ss) {
			System.out.println(movies.getText() );
		}
		
		
		driver = new ChromeDriver(options);
		

		Thread.sleep(3000);
		
		
	}
}
