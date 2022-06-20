package com.CreateUser;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintDataHRM {
	static WebDriver driver;
	@Test
	public void flow() throws IOException {
		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Leave")).click();
		// Locate 'Books & Authors' table using id
		WebElement BooksTable = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody"));
		//Get all web elements by tag name 'tr'
		List<WebElement> rowVals = BooksTable.findElements(By.tagName("tr"));
		
		//Get number of rows and columns
		//using absoulute xpath
		int rowNum = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/thead/tr")).size();
		//using relative xpath
		//int colNum = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/thead/tr/th[2]/span")).size();
		System.out.println("Total number of rows = " + rowNum);
		//System.out.println("Total number of columns = " + colNum);
		
		//Get column header values from first row
		List<WebElement> colHeader = rowVals.get(0).findElements(By.tagName("th"));
		//Loop through the header values and print them to console
		System.out.println("Header values:");
		for(int i=0; i<colHeader.size(); i++){
			System.out.println(colHeader.get(i).getText());
		}
		System.out.println("---------------");
		//Loop through the remaining rows
		for(int i=1; i<rowNum; i++){
			//Get each row's column values by tag name
			List<WebElement> colVals = rowVals.get(i).findElements(By.tagName("td"));
			//Loop through each column
			//for(int j=0; j<colNum; j++){
				//Print the coulumn values to console
				//System.out.println(colVals.get(j).getText());
			}
			//Just a separator for each row
			System.out.println("---------------");
		//}			
		
		//Printing table contents to console for fixed row and column numbers
		for(int i=2; i<=6; i++){
			for(int j=1; j<=4; j++){
				WebElement sd =driver.findElement(By.xpath("//*[@id=\"resultTable\"]"));
				System.out.println(sd.getText());
			}
			System.out.println("");
		}
		
	} //End of @Test

		
}
