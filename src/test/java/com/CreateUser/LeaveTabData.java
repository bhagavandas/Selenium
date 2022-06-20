package com.CreateUser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaveTabData {
	
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
			// application login page launched
			driver.get(url);

			// create object to access the non static methods and vars.
			LeaveTabData obj = new LeaveTabData();

			// login as admin - calling login method
			obj.login();

			// navigate to Leave page.
			obj.clickLeave("menu_leave_viewLeaveModule");
			obj.getSubTabNames("menu_leave_viewLeaveModule");

			// print number of links in Leave page.
			obj.linksCount("//*[@id='resultTable']/tbody/tr");
			
			// Method to choose Leave action: (Approve, Cancel, Reject)
			obj.leaveAction("Approve");		
		}

		
		// login method
		public void login() {
			String UserName = "Admin";
			String Password = "admin123";
			WebElement u_Name = driver.findElement(By.id("txtUsername"));
			WebElement u_Pwd = driver.findElement(By.name("txtPassword"));
			WebElement login_Btn = driver.findElement(By.id("btnLogin"));
			u_Name.clear();
			u_Name.sendKeys(UserName);
			u_Pwd.clear();
			u_Pwd.sendKeys(Password);
			login_Btn.click();
		}
		
		// Method click on Leave Module
		public void clickLeave(String str1) {
			WebElement tab_Leave = driver.findElement(By.id(str1));
			tab_Leave.click();
		}

		// Method to get Sub Tab Count
		public void getSubTabNames(String tabName) {

			String Main_tabName = driver.findElement(By.id(tabName)).getText();
			driver.findElement(By.id(tabName)).click();

			// logic to get the all sub tab names
			List<WebElement> subTabs = driver.findElements(By.cssSelector("#mainMenuFirstLevelUnorderedList > li.current.main-menu-first-level-list-item > ul>li"));
			int count = subTabs.size();
			System.out.println(Main_tabName + " Tab > Subtabs count : " + count +"\n");
			
	        for (WebElement webElement : subTabs) {
	            String subTabsname = webElement.getText();
	            System.out.println(subTabsname);
	        }
	        System.out.println("\n");
		}
		
		// Method to Get links count
		public void linksCount(String str) {
			List<WebElement> xyz = driver.findElements(By.xpath(str));
			int count = xyz.size();
			System.out.println("Leave List Table Rows Count : " + count +"\n");
			}
		
		// Method to select Leave Actions
		public void leaveAction(String val) throws InterruptedException {
			Thread.sleep(1000);
			driver.findElement(By.id("btnSearch")).click();
			System.out.println("Leave Pending Action Rows Count : " + driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size() +"\n");
		for (int i = 1; i <= driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size(); i++) {
			try {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i + "]/td[8]//option[contains(text(),'"+val+"')]")).click();
				System.out.println("Row" +i + ": "  + "'"+val+"'" + " action is available & selected!");
			} catch (Exception exc) {
				System.out.println("Row" +i + ": "  + "'"+val+"'" + " action IS NOT AVAILABLE TO SELECT!!");
//				System.out.println("Error message: " + exc.getMessage() +"\n");
			}
		}
	}
	}

