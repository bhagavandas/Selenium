package com.CreateUser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintMovieRating {
	static WebDriver driver;
	@Test
	public void flow() throws IOException {
		WebDriver driver;
		String url = "https://www.imdb.com/title/tt14209560/";
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(url);
		
		
		driver.findElement(By.linkText("Bheemla Nayak")).getText();
		System.out.println(driver.getTitle());
		WebElement sd = driver.findElement(By.xpath("//*[@class='sc-7ab21ed2-2 kYEdvH']"));
		System.out.println("review:"+sd.getText());
		WebElement view = driver.findElement(By.xpath("//*[@class='sc-7ab21ed2-3 dPVcnq']"));
		System.out.println("views :"+view.getText());
		WebElement year = driver.findElement(By.xpath("//*[@class='ipc-link ipc-link--baseAlt ipc-link--inherit-color sc-52284603-1 ifnKcw']"));
		System.out.println("release year :"+year.getText());
		WebElement duration = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[1]/div[1]/div/ul/li[2]"));
		System.out.println("duration time:"+duration.getText());
		
		
		}
		
		
}
