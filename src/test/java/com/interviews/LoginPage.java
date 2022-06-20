package com.interviews;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
public static void main(String[] args) {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.javatpoint.com/");
	
	driver.findElement(By.xpath("//*[@id=\"link\"]/div/ul/li[2]/a")).click();
	List<WebElement> we = driver.findElements(By.xpath("//*[@id=\"menu\"]"));
	for (WebElement ss : we) {
		System.out.println(ss.getText());
	}
	WebElement sd = driver.findElement(By.xpath("//*[@id=\"city\"]/table/tbody/tr/td/p[1]"));
	System.out.println(sd.getText());
	
	
	driver.close();
	
}
}
