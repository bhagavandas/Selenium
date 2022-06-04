package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.abs.MyClass;

//print number links ( count ) from orange HRM login page 

public class PrintNumOfLinks {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		// application login page launched
		driver.get(url);

		// create object to access the non static methods and vars.
		PrintNumOfLinks obj = new PrintNumOfLinks();

		// login as admin - calling login method
		obj.login();

		// navigate to PIM employee list page.
//		obj.clickPIM();

		// print number of links in the pim page
//		obj.linksCount("//*[@id='resultTable']/tbody/tr");

		// navigate to Admin tab
//		obj.clickAdmin();
		// print number of links in the pim page
//		obj.linksCount("//*[@id='resultTable']/tbody/tr");

		obj.getSubTabNames("menu_pim_viewPimModule");
		obj.getSubTabNames("menu_leave_viewLeaveModule");

	}

	public void getSubTabNames(String tabName) {

		String Main_tabName = driver.findElement(By.id(tabName)).getText();
		driver.findElement(By.id(tabName)).click();

		// logic to get the all sub tab names
		List<WebElement> subTabs = driver.findElements(By
				.cssSelector("#mainMenuFirstLevelUnorderedList > li.current.main-menu-first-level-list-item > ul>li"));
		int count = subTabs.size();
		
		
		System.out.println(Main_tabName +" Tab > Subtabs count : " + count);
	}

	// navigate to PIM tab
	public void clickPIM() {
//		css
		WebElement tab_PIM = driver.findElement(By.cssSelector("#menu_pim_viewPimModule"));
		tab_PIM.click();
	}

	// navigate to Admin tab
	public void clickAdmin() {
//			css
		WebElement tab_Admin = driver.findElement(By.cssSelector("#menu_admin_viewAdminModule"));
		tab_Admin.click();
	}

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

	public void linksCount(String val) {
		List<WebElement> xyz = driver.findElements(By.xpath(val));
		int count = xyz.size();
		System.out.println("Count : " + count);
	}
}
