package windowHandle;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.filesystem.model.File;

public class iFrameNeasted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
		// Switch to the parent frame first
		driver.switchTo().frame("frame-top");

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("screenshot.png"));

		
		// Then switch to a child frame inside the parent
		driver.switchTo().frame("frame-left");

		// Interact with elements inside "frame-left"
		WebElement element = driver.findElement(By.tagName("body"));
		System.out.println("Text in Left Frame: " + element.getText());

		// Switch back to the main content
		driver.switchTo().defaultContent();


	}

}
