package seleniumExamplePracticeNotes;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class screenShotWebPage {
    public static void main(String[] args) {
        // Set up ChromeDriver
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window and navigate to a URL
            driver.manage().window().maximize();
            driver.get("https://www.example.com");

            // Take a screenshot of the current page
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

            
            
            // Specify the destination file path
            File destFile = new File("screenshot.png");

            // Copy the screenshot to the destination
            FileUtils.copyFile(srcFile, destFile);

            System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
            
            
            
            
            
        } catch (IOException e) {
            System.out.println("An error occurred while saving the screenshot: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
