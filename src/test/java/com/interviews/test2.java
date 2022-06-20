package com.interviews;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {
	static WebDriver driver;

	public static void main(String[] args) {
		// pint the all QA Engineers list
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		// WebElement we = driver.findElement(By.id("resultTable"));
		// System.out.println(we.getText());
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[3]"));
		System.out.println("Number of Engineers : " + list.size());

//		List<WebElement> QA_List = driver
//				.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[3 and contains(text(),'ESS')]"));

//		List<WebElement> dd = driver.findElements(
//				By.xpath("//table[@id='resultTable']/tbody/tr/td[3 and contains(text(),'ESS')]/../td[2]"));
//
//		System.out.println(QA_List.size());

		//for (WebElement we1 : dd) {
			//System.out.println(we1.getText());

//		WebElement ss =  driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[3 and contains(text(),'ESS')]/../td[2]"));
//		ss.getText();
		//}
//	 for(int i=1;i<= QA_List.size(); i++){  
//		 String QA_name = 
//		 driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[3 and contains(text(),'ESS')]/../td[2]")).getText();
//		 
//		String QA_Role= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[3 and contains(text(),'ESS')]")).getText();
//		 
//		 
//	        System.out.println(QA_name +" - " +QA_Role);  
//	    }  

		for (int i = 1; i <= list.size(); i++) {
			String a = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[3]")).getText();

			if (a.equalsIgnoreCase("QA")) {

				String name = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[2]"))
						.getText();
				String role = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[3]"))
						.getText();

				System.out.println(name + " - " + role);
			}
		}

	}
}
