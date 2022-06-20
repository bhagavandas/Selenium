package com.interviews;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {
	WebDriver driver;

	@Test
	public void Test1() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Test2();
		Test3();
		Test4();
	}

	public void Test2() throws IOException {

		WebElement ss = driver
				.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		ss.sendKeys("RRR Movie Ratings");
		ss.submit();
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File(".\\screenshots\\" + "ssd.png"));

	}

	public void Test3() {
		WebElement sd = driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-FilmReview\"]/div[1]/div/div"));
		System.out.println("MovieRatingsReview : " + sd.getText());

	}

	public void Test4() throws IOException {
		driver.get("https://www.google.com/");
		WebElement ss = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		ss.sendKeys("Kommu Bhagavan Das");
		ss.submit();
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[1]/a[1]/div[1]/img")).click();
		File screen1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen1, new File(".\\screenshots\\" + "ds.png"));
		driver.close();
	}

}
