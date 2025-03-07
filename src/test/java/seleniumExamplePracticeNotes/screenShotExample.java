package seleniumExamplePracticeNotes;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://www.linkedin.com/feed/");
	        driver.manage().window().maximize();
	        
	        // Take Screenshot
	        TakesScreenshot ss = (TakesScreenshot) driver;
	        File scr = ss.getScreenshotAs(OutputType.FILE);
	        File dest = new File("C:\\Users\\91942\\OneDrive\\QA Interview\\LinkedInSS.png");
	        
	        FileUtils.copyFile(scr, dest);
	        System.out.println("Screenshot saved successfully!");

	        driver.quit();  // Close the browser after execution
		
		
		
		
		
	}

}
