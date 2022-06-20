package com.interviews;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintU_Role_Name {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		List<WebElement> list1 = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr/td[5]"));
		System.out.println("List : " + list1.size());
		
		List<WebElement> qa_list = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr/td[contains(text(),'QA Engineer')]"));
		//System.out.println(qa_list.size());
		for (WebElement webElement : qa_list) {
			System.out.println(webElement.getText());
		}
		for (int i=1; i<=qa_list.size(); i++) {
		String Name = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td[contains(text(),'QA Engineer')]/../td[3]")).getText();
		String QA_Role= driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td[contains(text(),'QA Engineer')]")).getText();
		 System.out.println(Name +"-"+ QA_Role);
		}
	}
}
