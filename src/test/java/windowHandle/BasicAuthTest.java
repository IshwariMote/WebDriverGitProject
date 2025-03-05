package windowHandle;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthTest {
    public static void main(String[] args) throws InterruptedException {
     //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    	
    	
        WebDriver driver = new ChromeDriver();
        
        // Open the target URL
        /*    driver.get("https://the-internet.herokuapp.com/basic_auth");

        // Wait for alert pop-up
        Thread.sleep(2000); 

        // Switch to alert
        Alert alert = driver.switchTo().alert();

        // Sending authentication using sendKeys() - Not always reliable
        alert.sendKeys("admin" + "\t" + "admin"); // Using tab to switch to password field

        // Accept the alert (submit credentials)
        alert.accept();
        
        // Verify authentication success
        WebElement successMessage = driver.findElement(By.cssSelector("p"));
        if (successMessage.getText().contains("Congratulations!")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Close browser
        driver.quit();
    }*/
    	
    	
    	// Pass authentication credentials in the URL
        String username = "admin";
        String password = "admin";
        String authURL = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";
        
        // Open the URL with authentication
        driver.get(authURL);
        
        // Print Page Title
        System.out.println("Page Title: " + driver.getTitle());
        
    }
}
