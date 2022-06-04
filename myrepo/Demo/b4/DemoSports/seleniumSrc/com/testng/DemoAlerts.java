package com.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

//		System.setProperty("webdriver.chrome.driver", "E:\\ExamplesTest\\DemoSports\\BrowserDrivers\\chromedriver.exe");
		
//		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
//		System.getProperty("user.dir");
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe");
		
//		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testuserautomation.github.io/Alerts/");
		DemoAlerts ss = new DemoAlerts();

//		driver.findElement(By.xpath("//button[1]")).click();
		Thread.sleep(3000);

//		al.accept();

//		driver.findElement(By.xpath("//button[2]")).click();
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(3000);
//		System.out.println("Text from alert : "+al.getText());
//		al.accept();

		driver.findElement(By.xpath("//button[3]")).click();
		Alert al = driver.switchTo().alert();
		
		al.sendKeys("this is 2nd testing");
		Thread.sleep(3000);
		al.accept();

//		al.dismiss();
//		al.sendKeys("fasdf");		
//		al.getText();

	}
}
