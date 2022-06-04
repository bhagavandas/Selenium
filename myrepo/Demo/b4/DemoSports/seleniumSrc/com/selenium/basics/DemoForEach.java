package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.abs.MyClass;

//print number links ( count ) from orange HRM login page 

public class DemoForEach {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		 int[] marks = { 125, 132, 95, 116, 110 };
		 for (int var1 : marks) 
			{ 
			    System.out.println(var1);
			}
			
		 
		 String[] names = { "shiva", "uday", "srujana", "jhansi", "bagavan", "raj" };
		
		 
		 for (String var2 : names) 
			{ 
			    System.out.println(var2);
			}
		 
		 for( int i=0; i<names.length; i++) {
			 System.out.println(i+1+". "+names[i]);
		 }
		 
		 
		 /*
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		// application login page launched
		driver.get(url);

		// create object to access the non static methods and vars.
		DemoForEach obj = new DemoForEach();

		// login as admin - calling login method
		obj.login();

		// navigate to Admin tab
		obj.clickAdmin();
		// print number of links in the pim page
		obj.linksCount("//*[@id='resultTable']/tbody/tr");
		*/

	}

	public void getSubTabNames(String tabName) {

		String Main_tabName = driver.findElement(By.id(tabName)).getText();
		driver.findElement(By.id(tabName)).click();

		// logic to get the all sub tab names
		List<WebElement> subTabs = driver.findElements(By
				.cssSelector("#mainMenuFirstLevelUnorderedList > li.current.main-menu-first-level-list-item > ul>li"));
		int count = subTabs.size();

		System.out.println(Main_tabName + " Tab > Subtabs count : " + count);
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
		
		
		u_Name.clear();
		u_Name.click();
		
		u_Name.getAttribute("");
		u_Name.getCssValue("");
		u_Name.getLocation();
		u_Name.getSize();
		u_Name.getTagName();
		u_Name.isDisplayed();
		
		u_Name.isEnabled();
		u_Name.isSelected();
		u_Name.submit();
		
		
		
		
	}

	public void test(String col1, String col2) {

		String username = driver.findElement(By.xpath("//*[@id='resultTable']//th/a[contains(text(), '" + col1 + "')]"))
				.getText();
		String status = driver.findElement(By.xpath("//*[@id='resultTable']//th/a[contains(text(), '" + col2 + "')]"))
				.getText();

		System.out.println(username + " : " + status);
	}

	public void linksCount(String val) {
		List<WebElement> xyz = driver.findElements(By.xpath(val));
		int count = xyz.size();
		System.out.println("Count : " + count);

		
		for (WebElement var : xyz) 
		{ 
		    System.out.println(var.getText());
		}
		
		 int[] marks = { 125, 132, 95, 116, 110 };
		 for (int var1 : marks) 
			{ 
			    System.out.println(var1);
			}
			
		 
		 String[] names = { "shiva", "uday", "srujana", "jhansi", "bagavan", "raj" };
		 
		 
		 for (String var2 : names) 
			{ 
			    System.out.println(var2);
			}
		 
		 for( int i=0; i<names.length; i++) {
			 System.out.println(names[i]);
		 }
		
		
//		xyz.forEach(name -> {
//			System.out.println(name.getText());
//
//		});
	}
}
