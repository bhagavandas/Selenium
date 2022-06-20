package com.ArrayJavaCollections;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.tools.ant.taskdefs.Length;
import org.apache.tools.ant.types.FileList;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbData {
           WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
	
//		Object listofElements = driver.findElement(By.xpath("//*[@id='month']")); //to take all elements matching xpath
//
//				for i in range(Length(listofElements)); 
//				    System.out.println(listofElements[i].text); //print all elements of list
//				}
		
//		public void failedTest() throws IOException {
		
		 File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(screen, new File(".\\screenshots\\"+this.getClass().getName()+".png"));
		

//		 WebElement d =	driver.findElement(By.xpath("//*[@id='month']"));
//	      //Select class to get options in dropdown
//	      Select l = new Select(d);
//	      java.util.List<WebElement> m = l.getOptions();
//	      System.out.println("Drodown list items are: ");
	      //iterate through options till list size
//	      for (int j = 0; j < m.size(); j++) {
//	         String s = m.get(j).getText();
//	         System.out.println(s);
	      }
		
}

		
		
		
		
		
		
		//driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		
		//driver.findElement(By.xpath("//select[@id='month']")).click();
		
		
//		WebElement drop_down =driver.findElement(By.xpath("//select[@id='month']"));
//		Select se = new Select(drop_down);
//		java.util.List<WebElement> s = se.getOptions();
//		System.out.println(s);
		
		
//		ArrayList<String> list = new ArrayList<String>();
//
//		list.add("banana");
//		
//		list.add("apple");
//
//		System.out.println(list.size());
//		ArrayList<String> list2 = new ArrayList<String>();
//		
//		 Collections.sort(list);  
//		System.out.println(list  );
//		
		
		
	


	

