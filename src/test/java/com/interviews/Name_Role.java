package com.interviews;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name_Role {
public static void main(String[] args) {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	
	List<WebElement> List_Eng = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[5]"));
	System.out.println("List of Engineers : " + List_Eng.size());
	
	for (int i = 1; i<= List_Eng.size(); i++) {
		String ss = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[5]")).getText();
		if (ss.equalsIgnoreCase("Software Engineer")) {
			String Name = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[3]")).getText();
		String Role = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[5]")).getText();
		
		System.out.println(Name + " - " + Role);
		}
	}

	
	
}
}
