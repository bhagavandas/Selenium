package com.CreateUser;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintUserData {
	static WebDriver driver;
	@Test
	public void flow() throws IOException {
		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Leave")).click();
//		driver.findElement(By.linkText("Odis Adalwin")).click();
//		//driver.findElement(By.linkText("Driver's License Number")).click();
//		List<WebElement> sd = driver.findElements(By.id("sidenav"));
//		for(WebElement dropdownElements : sd ) {
//			System.out.println(dropdownElements.getText());
//			
			WebElement Emp_name = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[3]/td[2]"));	
			WebElement Emp_name1 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a"));
			WebElement Emp_name2 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/a"));
			WebElement Emp_name3 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[3]/td[2]/a"));
			//WebElement Emp_name4 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[4]/td[2]/a"));
			
			
			
			
			WebElement Leave_Type = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[3]/td[3]"));
			WebElement Leave_Type1 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[3]"));
			WebElement Leave_Type2 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[3]"));
			WebElement Leave_Type3 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[3]/td[3]"));
			//WebElement Leave_Type4 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[4]/td[3]"));
			
			
			
			
			WebElement Actions = driver.findElement(By.xpath("//*[@id=\"select_leave_action_57\"]/option[4]"));
			Actions.click();
			WebElement Actions1 = driver.findElement(By.xpath("//*[@id=\"select_leave_action_68\"]/option[2]"));
			Actions1.click();
			WebElement Actions2 = driver.findElement(By.xpath("//*[@id=\"select_leave_action_67\"]/option[2]"));
			Actions2.click();
			WebElement Actions3 = driver.findElement(By.xpath("//*[@id=\"select_leave_action_66\"]/option[3]"));
			Actions3.click();
			//WebElement Actions4 = driver.findElement(By.xpath("//*[@id=\"select_leave_action_65\"]/option[1]"));
			//Actions4.click();
			
			
			
			
			System.out.println("Name :" + Emp_name.getText() +"  "+ "Leave Type :" + Leave_Type.getText() +"   "+ "Action :" + Actions.getText());
			System.out.println("Name :" + Emp_name1.getText() +"  "+ "Leave Type :" + Leave_Type1.getText() +"   "+ "Action :" + Actions1.getText());
			System.out.println("Name :" + Emp_name2.getText() +"  "+ "Leave Type :" + Leave_Type2.getText() +"   "+ "Action :" + Actions2.getText());
			System.out.println("Name :" + Emp_name3.getText() +"  "+ "Leave Type :" + Leave_Type3.getText() +"   "+ "Action :" + Actions3.getText());
			//System.out.println("Name :" + Emp_name4.getText() +"  "+ "Leave Type :" + Leave_Type4.getText() +"   "+ "Action :" + Actions4.getText());
			
			
			
	}	
			
		}
		
		
		
		
	
