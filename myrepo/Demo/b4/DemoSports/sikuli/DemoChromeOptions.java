import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoChromeOptions {
	public static void main(String[] args) throws FindFailed, InterruptedException {

		String filepath = "C:\\Users\\Lenovo\\Downloads\\";
//		String inputFilePath = "C:\\Users\\Lenovo\\Downloads\\";
//		Screen s = new Screen();
//		Pattern fileInputTextBox = new Pattern(filepath + "FileTextBox.PNG");
//		Pattern openButton = new Pattern(filepath + "OpenButton.PNG");
		WebDriver driver;

		// Open Chrome browser
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
//		options.addArguments("--incognito");
//		options.addArguments("--headless");


		String username = "admin";

		// Set the password
		String password = "admin";

		String URL = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
//		String URL = "https://the-internet.herokuapp.com/basic_auth";

		driver = new ChromeDriver(options);
//		driver.get("http://demo.guru99.com/test/image_upload/index.php");
//		driver.get("https://www.spicejet.com/");
//		driver.get("https://the-internet.herokuapp.com/upload");
		driver.get(URL);

		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		// Close the browser
//		driver.close();

	}
}
