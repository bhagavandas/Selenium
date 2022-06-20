package com.ScreenshotfailTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;





@Listeners(ListenerDemo.class)
public class CreateNewUser1  extends Parent1 {


	@BeforeClass
	public void be() {
		SetupBrowser();
	}

	@AfterClass
	public void close() {
		driver.quit();
	}

	@Test
	public void testCreateNewUserDemo() {

		String pageTitle = driver.getTitle();
		System.out.println("testCreateNewUserDemo page title : " + pageTitle);
		Assert.assertEquals(pageTitle, "Facebook – log in or sign u", "FB Page title does not match");		
	}
	@Test
	public void testCreateNewUserDemo3() {
		driver.navigate().to("http://www.yahoo.com");
		String pageTitle = driver.getTitle();
		System.out.println("testCreateNewUserDemo page title : " + pageTitle);
		Assert.assertEquals(true, false, "yahoo Page title does not match");	
	}
	
	@Test
	public void testCreateNewUserDemo4() {
		driver.navigate().to("http://www.yahoo.com");
		String pageTitle = driver.getTitle();
		System.out.println("testCreateNewUserDemo page title : " + pageTitle);
		Assert.assertEquals(true, true, "Page title does not match");	
	}

	@Test
	public void testCreateNewUserDemo2() {
		driver.navigate().to("http://www.google.com");
		String pageTitle = driver.getTitle();
		System.out.println("testCreateNewUserDemo2 page title : " + pageTitle);
		Assert.assertEquals(pageTitle, "Google", "google Page title does not match");

	}

}


