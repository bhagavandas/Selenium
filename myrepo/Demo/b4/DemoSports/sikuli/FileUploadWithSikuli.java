import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadWithSikuli {
	@Test
	public void fileUpload() throws Exception {
//		String filepath = "C:\\Users\\Lenovo\\";
		String filepath = "E:\\bird\\";
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='imagesrc']/..")).click();

		
		
		
		Screen screen = new Screen();
//		Pattern fileNameInput = new Pattern("C:\\Users\\Lenovo\\filename.PNG");
//		Pattern openButton = new Pattern("C:\\Users\\Lenovo\\open.PNG");
		
		Pattern fileInputTextBox = new Pattern(filepath + "filename.PNG");
        Pattern openButton = new Pattern(filepath + "open.PNG");
		screen.wait(fileInputTextBox, 10);
		screen.type(fileInputTextBox, filepath+"sample_kumar_resume.docx");
		screen.click(openButton);
		
	}
}
