package seleniumExamplePracticeNotes;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class JavaScriptExecutorUses {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		System.out.println("Waiting Page to Load....");
		
		System.out.println("Executing JavaScript .....");
	
	//	javascriptExecutorScrollView() ;
	//	javascriptExecutorSClickMethod();
		HandleAJAXCalls();
		
		
	}
		public static void javascriptExecutorScrollView() {
			
			WebElement pageUp = driver.findElement(By.xpath("//div [text()='499 only']"));

			WebElement pageDown = driver.findElement(By.xpath("//a [text()='Brand Directory']"));
			//
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0]. scrollIntoView(false);",pageDown);
			System.out.println("System Moved Down... ");
			
			js.executeScript("arguments[0]. scrollIntoView(true);",pageUp);
			
			//js.executeScript("window.scrollBy(0,500)"); // Scroll down
			System.out.println("System Moved up ");
			
			
	

	}
		
		public static void javascriptExecutorSClickMethod() {
			
			WebElement element = driver.findElement(By.xpath("//span[text()='Mobiles']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
			System.out.println("javascript click method .....");

		}
		
		
		public static void ElementClickInterceptedExceptionHandle() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			try {
			    // Wait for overlay to disappear
			    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay")));

			    // Attempt normal Selenium click
			    driver.findElement(By.id("submitButton")).click();
			} catch (ElementClickInterceptedException e) {
			    // Use JavaScript click if normal click fails
			    JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("arguments[0].click();", driver.findElement(By.id("submitButton")));
			}

		}
		
		public static void HandleAJAXCalls() {
			
			      
			        // Close login pop up if it appears
					/*
					 * try {
					 * 
					 * System.out.println("Checking login pop...."); WebDriverWait wait = new
					 * WebDriverWait(driver,Duration.ofSeconds(10)); WebElement closeLoginPopup =
					 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					 * "//button[contains(text(),'✕')]"))); closeLoginPopup.click(); } catch
					 * (NoSuchElementException e) {
					 * System.out.println("Login popup did not appear."); }
					 */

			        // Search for "iPhone 15"
			        WebElement searchBox = driver.findElement(By.name("q"));
			        searchBox.sendKeys("iPhone 15");
			        searchBox.sendKeys(Keys.ENTER);

			        // Wait for AJAX to complete using jQuery
			        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			        JavascriptExecutor js = (JavascriptExecutor) driver;
			        
			        
			        System.out.println("Wating to end AJAX Call ....");
			        wait.until(driver -> (Boolean) js.executeScript("return document.readyState").equals("complete"));
			        System.out.println("AJAX Call Ended ...."); 
			        
			        
			        System.out.println(" Now wait for first product to be visible..");
			        WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div [contains(text(),'Apple iPhone') ])[1]")));
			        
			        // Click on the first product
			        firstProduct.click();

			        System.out.println("Successfully clicked the first product after AJAX completion.");

			        // Close the browser
			        driver.quit();
			    }
			
}
