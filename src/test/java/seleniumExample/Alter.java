package seleniumExample;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Alter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		 // Get the current window handle (main window)
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("Main Window Handle: " + mainWindowHandle);
        
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All Window Handles: " + allWindowHandles);
		
		/*
		 * Alert alert = driver.switchTo().alert(); 
		 * alert.accept();
		 * 
		 * Select dropdown = new Select(driver.findElement(By.id("dropdown")));
		 * dropdown.selectByVisibleText("Option1"); dropdown.
		 */

        
     // Switch to the alert box
        Alert alert = driver.switchTo().alert();

        // Get the text from the alert
        String alertText = alert.getText();
        System.out.println("Alert message: " + alertText);

        // Accept the alert (click OK)
        alert.accept();

        
     // Switch to the alert
        Alert alert1 = driver.switchTo().alert();

        // Get the alert message
        String alertMessage = alert1.getText();
        System.out.println("Alert message: " + alertMessage);

        // Click "OK" (accept the alert)
        alert1.accept();

        // Or click "Cancel" (dismiss the alert)
        alert1.dismiss();
        
     // Switch to the prompt alert
        Alert alert2= driver.switchTo().alert();

        // Get the alert message
        String alertMessage1 = alert1.getText();
        System.out.println("Prompt message: " + alertMessage1);

        // Send text to the alert's input box
        alert2.sendKeys("Selenium Input");

        // Accept the alert (click OK)
        alert1.accept();


		/*
		 * Methods to Handle Alerts: 
		 * accept(): Clicks the OK button on the alert.
		 * dismiss(): Clicks the Cancel button (or dismisses the alert).
		 * getText(): Retrieves the text displayed in the alert. 
		 * sendKeys(String text): Sends input  text to the alert (used in prompt alerts).
		 */
        
        
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
        
	}

}
