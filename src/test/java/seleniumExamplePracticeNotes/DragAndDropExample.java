package seleniumExamplePracticeNotes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update the path

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a demo site for drag-and-drop
            driver.get("https://jqueryui.com/droppable/");

            // Switch to the iframe that contains the drag-and-drop elements
            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

            // Locate the draggable and droppable elements
            WebElement draggable = driver.findElement(By.id("draggable"));
            WebElement droppable = driver.findElement(By.id("droppable"));

            // Create an Actions object
            Actions actions = new Actions(driver);

            // Perform drag and drop
            actions.dragAndDrop(draggable, droppable).perform();

            // Optionally, you can add a wait to observe the result
            Thread.sleep(2000); // Keep the browser open for 2 seconds to see the result

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the driver
            driver.quit();
        }
    }
}
