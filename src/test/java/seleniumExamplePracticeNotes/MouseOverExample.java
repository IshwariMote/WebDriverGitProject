package seleniumExamplePracticeNotes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverExample {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update the path

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to MakeMyTrip
            driver.get("https://www.makemytrip.com");

            // Wait for the page to load completely
            Thread.sleep(5000); // Not the best practice; use WebDriverWait in production

            // Locate the "Holidays" menu item (or any other element you want to hover over)
            WebElement holidaysMenu = driver.findElement(By.xpath("//span[text()='Holidays']"));

            // Create an Actions object
            Actions actions = new Actions(driver);

            // Perform the mouse-over action
            actions.moveToElement(holidaysMenu).perform();

            // Wait to observe the result
            Thread.sleep(5000); // Keep the browser open for a while to see the hover effect

            //Drag n drop 
			/*
			 * Actions refName= new Actions(driver);
			 * refName.dragAndDrop(sourceWebElement,destWebElement).perform();
			 * 
			 * Actions refName1= new Actions(driver );
			 * refName1.clickAndHold(WebElementRef).perform();
			 * refName.release(WebElementRef).perform();
			 */            
            
            Actions actions1 = new Actions(driver);
            WebElement menu = driver.findElement(By.id("menu"));
            actions1.moveToElement(menu).perform();

            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the driver
            driver.quit();
        }
    }
}
