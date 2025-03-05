package windowHandle;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iFrameHandle {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
      
        driver.findElement(By.xpath("//div[@class='tox-icon']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("mce_0_ifr")));
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Step 1: Switch to the iframe using its ID or WebElement
        driver.switchTo().frame("mce_0_ifr"); // Switch by frame ID
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
        // Step 2: Interact with elements inside the iframe
        WebElement textArea = driver.findElement(By.id("tinymce"));
        textArea.clear(); // Clear any existing text
        textArea.sendKeys("Hello, this is a test inside an iframe!");

        // Step 3: Switch back to the main content
        driver.switchTo().defaultContent();

        // Verify interaction outside the iframe (e.g., page title)
        System.out.println("Page Title: " + driver.getTitle());

        // Clean up
        driver.quit();
    }
}
