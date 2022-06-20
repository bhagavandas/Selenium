package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmailscreenshot1 {
	WebDriver driver;
@Test
public void gmail() throws IOException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	test();
	test2();
}
public void test() throws IOException {
	
	File screen= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screen, new File(".\\screenshots\\"+this.getClass().getName()+".png"));
}
public void test2() throws IOException {
	driver.get("https://www.google.com/search?q=telugu+movie+titles&rlz=1C1VDKB_enIN981IN981&sxsrf=APq-WBuel1me4LBgFr9sIGai7nfh7ryOBg:1648187725406&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj1_JTfyeD2AhWt7HMBHZj4ArMQ_AUoAXoECAEQAw&biw=1536&bih=714&dpr=1.25");
	File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screen, new File(".\\screenshots\\"+"ssd.png"));
}
}
