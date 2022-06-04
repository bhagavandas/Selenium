import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSikuli {
	public static void main(String[] args) throws FindFailed, InterruptedException {

		String filepath = "C:\\Users\\Lenovo\\Downloads\\";
		String inputFilePath = "C:\\Users\\Lenovo\\Downloads\\";
		Screen s = new Screen();
		Pattern fileInputTextBox = new Pattern(filepath + "FileTextBox.PNG");
		Pattern openButton = new Pattern(filepath + "OpenButton.PNG");
		WebDriver driver;

		// Open Chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("http://demo.guru99.com/test/image_upload/index.php");

		driver.get("https://the-internet.herokuapp.com/upload");

		Thread.sleep(3000);
		// Click on Browse button and handle windows pop up using Sikuli
//		WebElement e = driver.findElement(By.xpath("//input[@id='photoimg']"));
		Actions ac = new Actions(driver);
		

		WebElement e = driver.findElement(By.xpath("//input[@id='file-upload']"));
		ac.moveToElement(e).build().perform();
		e.click();
		s.wait(fileInputTextBox, 20);
		s.type(fileInputTextBox, inputFilePath + "Test.docx");
		s.click(openButton);

		// Close the browser
//		driver.close();

	}
}
