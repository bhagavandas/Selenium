package com.ScreenshotfailTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomerListenerDemo.class)

public class FailedTestScreenDemo extends Parent1 {
	
	 

		@BeforeMethod
		public void setUp() {
			setUp();
		}

		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

		@Test
		public void testFailedTestScreenshot() {

			Assert.assertEquals(false, true);

		}

	}
