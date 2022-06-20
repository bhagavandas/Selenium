package com.CompareStrings;

import java.util.List;

import org.apache.commons.math3.random.ValueServer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompareStringsDemo {
	@Test
	public void test() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		int count = 0;
		// Expected values in dropdown
		String[] values = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };
		

		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);

		WebElement dropdownElement = driver.findElement(By.id("month"));
		WebElement dropdownElement1 = driver.findElement(By.id("day"));
		Select select = new Select(dropdownElement);
		Select select1 = new Select(dropdownElement1);
		// select.getoptions() returns all options belonging to select tag
		List<WebElement> options = select.getOptions();
		List<WebElement> options1 = select1.getOptions();
		
		System.out.println("Values Length " +values.length);
		System.out.println("options length " + options.size());
		System.out.println("options length " + options1.size());
		
		for (WebElement option : options) {
			System.out.println(option.getText());
			
			for (int i=0; i < values.length; i++ ) {
				if(option.getText().equalsIgnoreCase(values[i]));
				count++;
			}
			for (WebElement option1 : options1) {
				System.out.println(option1.getText());
				
				
			
		}
		
	if (count == values.length) {
		System.out.println("values matched..");
	} else {
		System.out.println("values not matched");
	}
}
	}
}
