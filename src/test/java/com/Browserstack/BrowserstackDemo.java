package com.Browserstack;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserstackDemo {
	public static final String USERNAME = "bhagavandas_RxVJh5";
	public static final String AUTOMATE_KEY = "qSijqG1wFULAY2LkLxvs";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	@Test
	
	
		public void run() throws InterruptedException {
		String key;
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("browser", "safari");
		capsHashtable.put("browser_version", "latest");
		capsHashtable.put("os", "OS X");
		capsHashtable.put("os_version", "Big Sur");
		capsHashtable.put("build", "browserstack-build-1");
		capsHashtable.put("name", "Sample Test");
		DesiredCapabilities caps = new DesiredCapabilities();
		// Iterate over the hashtable and set the capabilities
		Set<String> keys = capsHashtable.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			key = itr.next();
			caps.setCapability(key, capsHashtable.get(key));
		}
		
	    	WebDriver driver;
			try {
				driver = new RemoteWebDriver(new URL(URL), caps);
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				// Searching for 'BrowserStack' on google.com
				driver.get("https://www.google.com");
				WebElement element = driver.findElement(By.name("q"));
				element.sendKeys("selenium soft assertions");
				element.submit();
				// Setting the status of test as 'passed' or 'failed' based on the condition; if
				// title of the web page contains 'BrowserStack'
//				WebDriverWait wait = new WebDriverWait(driver, 5);
				Thread.sleep(5000);
				System.out.println(driver.getTitle());
				Assert.assertEquals("selenium soft assertions - Google Search", driver.getTitle());
				driver.quit();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}

