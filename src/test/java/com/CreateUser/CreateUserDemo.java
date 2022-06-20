package com.CreateUser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateUserDemo {
	
	static WebDriver driver;
	@Test
	public void flow() throws IOException {
		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		// verify the dashbaord tab
		driver.findElement(By.id("menu_dashboard_index")).click();
		// go to Admin
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		// verify admin
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		// serach for user
		
		By locator = By.id("searchSystemUser_userName");
		By locator1 = By.id("searchBtn");
		// By empname = By.id("//tr[1]/td[2]/a");
		if (driver.findElements(locator).size() > 0) {
			driver.findElement(locator).sendKeys("Charlie.Carter");
			if (driver.findElement(locator1).isDisplayed()) {
				driver.findElement(locator1).click();
					// Add User
					driver.findElement(By.id("btnAdd")).click();
				selectRole();
				selectEmpName();
				
			}
		}
	}
	
	public void selectRole() {
		WebElement selectUserRole = driver.findElement(By.id("systemUser_userType"));
		// enterdata
		Select sc = new Select(selectUserRole);
		sc.selectByIndex(0);
	}
	
	public void selectEmpName () throws IOException {
		String emp_name = "Charlie Carter";
		WebElement selectEmpName = driver.findElement(By.id("systemUser_employeeName_empName"));
		selectEmpName.click();
		selectEmpName.sendKeys(emp_name);
		selectEmpName.click();
		
		
		List<WebElement> ss = driver.findElements(By.xpath("//div[@class='ac_results']/ul/li"));
		
		if(ss.size()>0) {
		WebElement emp=	driver.findElement(By.xpath("//div[@class='ac_results']/ul/li/strong[contains(text(), '"+emp_name+"')]"));
			if (emp.isDisplayed())
			{
				emp.click();
				driver.findElement(By.name("systemUser[userName]")).sendKeys("IQSmart477");
				driver.findElement(By.xpath("//*[@id=\"systemUser_status\"]/option[1]")).click();
				driver.findElement(By.name("systemUser[password]")).sendKeys("Iqsmart@123");
				driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys("Iqsmart@123");
				driver.findElement(By.xpath("//*[@id='btnSave']")).click();
			}	
			}	
	}
}
		    
			
			
		
		
	

