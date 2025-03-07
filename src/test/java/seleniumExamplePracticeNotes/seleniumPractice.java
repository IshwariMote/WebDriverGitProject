package seleniumExamplePracticeNotes;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class seleniumPractice {
	
	public static void main(String[] args) throws IOException {
		
		
		/*
		 * WebDriver driver = new ChromeDriver(); WebDriverWait wait = new
		 * WebDriverWait(driver, Duration.ofSeconds(30));
		 * driver.get("https://the-internet.herokuapp.com/");
		 * 
		 * // Set implicit wait of 10 seconds
		 * 
		 * driver.manage().window().maximize();
		 * wait.until(ExpectedConditions.titleContains("The Internet"));
		 * System.out.println( driver.getTitle()); System.out.println(
		 * driver.getCurrentUrl());;
		 */
	      // System.err.println(driver.manage());
	       
	       // Navigate to a new page and back
         //  driver.findElement(By.linkText("Dropdown")).click();//linkText
         //  wait.until(ExpectedConditions.titleIs("Dropdown"));  
           
           //Located the element and clicked 
			/*
			 * WebElement dropdown =driver.findElement(By.id("dropdown")); dropdown.click();
			 * OR
			 */
           //driver.findElement(By.id("dropdown")).click();
           
        // Interact with dropdown using Select
          // Select dropdownselect = new Select(driver.findElement(By.id("dropdown")));
			/*
			 * ((WebElement) dropdownselect).click();
			 * 
			 * dropdownselect.selectByVisibleText("Option 1");
			 * System.out.println("Selected Option 1."); dropdownselect.selectByIndex(2);
			 * System.out.println("Selected Option 2.");
			 */

			/*
			 * List <WebElement> l = dropdownselect.getOptions(); int s=l.size();
			 * System.out.println( "we have "+s+" dropdown options "); // int SeclastOption
			 * = s-2;
			 */
			/*
			 * dropdownselect.selectByIndex(SeclastOption); if (s>=2) {
			 * dropdownselect.selectByIndex(SeclastOption);
			 * System.out.println("Option seleted"); } else {
			 * System.out.println("Not enouph options in dropdown to select"); }
			 */
         
          // wait.until(ExpectedConditions.titleIs("Dropdown"));  
         //  System.out.println("Navigated to Dropdown Page.");
           
           
           // SenbdKeys 
			/*
			 * driver.findElement(By.id("fileInput")).sendKeys("/path/to/file");
			 * wait.until(ExpectedConditions.titleIs("fileInput"));
			 */
           
           
           
           
       

          
                  // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
				
					  WebDriver driver = new ChromeDriver();
					 /* 
					 * // Set Implicit Wait
					 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					 * 
					 * driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
					 * driver.findElement(By.tagName("button")).click();
					 * 
					 * WebElement message = driver.findElement(By.id("finish"));
					 * System.out.println("Message: " + message.getText());
					 */
          

                // Mouse hover using Actions class 
					  
					  
				/*
				 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				 * 
				 * driver.navigate().to("https://the-internet.herokuapp.com/hovers"); Actions
				 * actions = new Actions(driver); WebElement image =
				 * driver.findElement(By.xpath("//div[@class='figure'][1]"));
				 * 
				 * 
				 * actions.moveToElement(image).perform();
				 * System.out.println("Mouse hovered over the image.");
				 * 
				 */

           
				/*
				 * driver.navigate().back(); System.out.println("Navigated back to home.");
				 */
					  
				/*
				 * // Navigate to the webpage with drag-and-drop functionality
				 * driver.get("https://jqueryui.com/droppable/");
				 * 
				 * // Switch to the iframe containing the drag-and-drop elements
				 * driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
				 * 
				 * // Locate the draggable and droppable elements WebElement sourceElement =
				 * driver.findElement(By.id("draggable")); // The element to be dragged or xpath
				 * - //div[@id='draggable'] WebElement targetElement =
				 * driver.findElement(By.id("droppable")); // The element where it needs to be
				 * dropped
				 * 
				 * // Create an instance of the Actions class Actions actions = new
				 * Actions(driver);
				 * 
				 * // Perform drag-and-drop action actions.dragAndDrop(sourceElement,
				 * targetElement).perform();
				 * 
				 * // Verify the result String droppedText = targetElement.getText(); if
				 * (droppedText.equals("Dropped!")) {
				 * System.out.println("Drag and Drop successful!"); } else {
				 * System.out.println("Drag and Drop failed!"); }
				 */
	       
				/*
				 * driver.manage().window().maximize(); driver.get("https://www.example.com");
				 * 
				 * // Take a screenshot of the current page TakesScreenshot screenshot =
				 * (TakesScreenshot) driver; File srcFile =
				 * screenshot.getScreenshotAs(OutputType.FILE);
				 * 
				 * // Specify the destination file path File destFile = new
				 * File("screenshot.png");
				 * 
				 * // Copy the screenshot to the destination FileUtils.copyFile(srcFile,
				 * destFile);
				 * 
				 * System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
				 */
				/*
				 * driver.get("https://the-internet.herokuapp.com"); JavascriptExecutor js =
				 * (JavascriptExecutor) driver; js.executeScript("window.scrollBy(-1000, 0)");
				 */
					  
					  
				/*
				 * // Open the URL driver.get("https://the-internet.herokuapp.com/dropdown");
				 * 
				 * // Print all dropdown options Select dropdown = new
				 * Select(driver.findElement(By.id("dropdown")));
				 * dropdown.getOptions().forEach(option ->System.out.println(option.getText()));
				 */
					  
					  
					 
					        /*  try {
					              // Open a website that opens multiple windows
					              driver.get("https://the-internet.herokuapp.com/windows");
					              driver.findElement(By.linkText("Click Here")).click(); // Open child windows multiple times
					              
					              // Get all window handles
					              ArrayList<String> windowHandles = new ArrayList<>(driver.getWindowHandles());

					              // Check if there are at least 9 windows
					              if (windowHandles.size() >= 9) {
					                  // Switch to the 8th child window (index 8, as index starts from 0)
					                  driver.switchTo().window(windowHandles.get(8));
					                  System.out.println("Switched to 8th child window. Title: " + driver.getTitle());
					              } else {
					                  System.out.println("Not enough windows open. Found only: " + windowHandles.size());
					              }

					          } catch (Exception e) {
					              System.out.println("An error occurred: " + e.getMessage());
					          } finally {
					              // Close all windows
					              driver.quit();
					          }
					      }*/
					  
					  // Navigate to the page with alerts
			            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

			            // Handle a simple alert
			            System.out.println("Handling Simple Alert:");
			            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
			            Alert simpleAlert = driver.switchTo().alert();
			            System.out.println("Alert Text: " + simpleAlert.getText());
			            simpleAlert.accept(); // Click OK

			            // Handle a confirmation alert
			            System.out.println("\nHandling Confirmation Alert:");
			            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
			            Alert confirmAlert = driver.switchTo().alert();
			            System.out.println("Alert Text: " + confirmAlert.getText());
			            confirmAlert.dismiss(); // Click Cancel

			            // Handle a prompt alert
			            System.out.println("\nHandling Prompt Alert:");
			            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			            Alert promptAlert = driver.switchTo().alert();
			            System.out.println("Alert Text: " + promptAlert.getText());
			            promptAlert.sendKeys("Hello, Selenium!"); // Input text
			            promptAlert.accept(); // Click OK
			            System.out.println("Prompt Alert handled successfully.");
					  

	     //  driver.quit();
	       
	}
}

