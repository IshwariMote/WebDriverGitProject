package seleniumExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumWaitExamples {

	

	
	    public static void main(String[] args) {
	        // Set up ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/");
	        
	        // Set implicit wait of 10 seconds
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        // Navigate to a form page
	        driver.get("https://example.com/form");

	        // Locate and fill the form fields
	        WebElement nameField = driver.findElement(By.id("name"));
	        WebElement emailField = driver.findElement(By.id("email"));
	        nameField.sendKeys("John Doe");
	        emailField.sendKeys("john.doe@example.com");

	        // Set up explicit wait (waiting for "Submit" button to be clickable)
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // selenium new version 
	      //  WebDriverWait wait = new WebDriverWait(driver, 10); // Max wait time is 10 seconds - selenium old version
	        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submitButton")));
	        
	      //  WebElement eleLocate = wait.until(ExpectedConditions.visibilityOfAllElementLocatedBy(By.id("element-id")));

	        // Click the submit button after it becomes clickable
	        submitButton.click();
	        
	        // Close the browser
	        driver.quit();
	    }
	

}
