package com.UsingExtendsPrintData;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParentPrintData extends LoginMethod {
@Test


public void printdata() {
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://www.javatpoint.com/");
	driver.findElement(By.name("search")).click();
	WebElement sd = driver.findElement(By.name("search"));
			sd.sendKeys("Arrays");
			sd.sendKeys(Keys.ENTER);
			sd.sendKeys(Keys.ARROW_DOWN);
	
//	List<WebElement> sd = driver.findElements(By.id("menu"));
//	for(WebElement dropdownElements : sd ) {
		//System.out.println(dropdownElements.getText());
	//}
}

}
