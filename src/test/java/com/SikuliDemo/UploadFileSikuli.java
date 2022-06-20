package com.SikuliDemo;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileSikuli {
	public static void setClipboardData(String string) {
		// StringSelection is a class that can be used for copy and paste operations.
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public static void uploadFile(String fileLocation) {
		try {
			// Setting clipboard with file location
			setClipboardData(fileLocation);
			// native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	@Test(description = "Upload fle by using robot class")
	public void fileUploadRobot() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement element = driver.findElement(By.xpath("//input[@id='imagesrc']/.."));
		element.click();
		uploadFile("e:\\bird\\bird.png");
		Thread.sleep(2000);
	}

	@Test(enabled = false, description = "this is file upload test by using sikuli")
	public void fileUpload() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='imagesrc']/..")).click();
		Thread.sleep(5000);
		Screen screen = new Screen();

		Pattern fileInputTextBox = new Pattern("E:\\bird\\FileOpenInput2.png");
		Pattern openButton = new Pattern("E:\\bird\\OpenButton.png");
//		screen.wait(fileInputTextBox, 20);
		screen.type(fileInputTextBox, "E:\\bird\\bird.png");
		screen.click(openButton);

	}

	@Test(enabled = false, description = "Test file upload by using sendkeys method.")
	public void sendKeysUploadFile() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='imagesrc']/..")));

		WebElement we = driver.findElement(By.xpath("//input[@id='imagesrc']/.."));
//		we.click();
//		we.sendKeys("E:\\bird\\bird.png");

		String inputText = "E:\\bird\\bird.png";

		String js = "arguments[0].setAttribute('value','" + inputText + "')";
		((JavascriptExecutor) driver).executeScript(js, we);

	}

	@Test(enabled = false, description = "Test file upload by using sendkeys method.")
	public void sendKeysUploadFile2() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/upload");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-upload")));

		driver.findElement(By.id("file-upload")).sendKeys("E:\\bird\\bird.png");

		driver.findElement(By.id("file-submit")).click();

	}
}

