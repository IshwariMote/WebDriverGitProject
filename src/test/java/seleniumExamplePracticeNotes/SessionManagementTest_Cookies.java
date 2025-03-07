package seleniumExamplePracticeNotes;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SessionManagementTest_Cookies {
    public static void main(String[] args) {
        // Step 1: Open Browser and Login
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.naukri.com/nlogin/login"); // Open login page
        
        // Perform login
        driver.findElement(By.id("usernameField")).sendKeys("ishwarimote22@gmail.com");
        driver.findElement(By.id("passwordField")).sendKeys("Ishwari@22");
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

        // Wait for login to complete
        try {
            Thread.sleep(5000); // Wait for session to establish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Capture session cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Cookies saved: " + cookies);

        // Close the browser
        driver.quit();

        // Step 2: Open a new browser session and restore cookies
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.naukri.com/mnjuser/profile"); // Open profile page directly

        // Restore cookies
        for (Cookie cookie : cookies) {
         driver.manage().addCookie(cookie);
        }
        // Refresh the page to apply cookies
        driver.navigate().refresh();
        
     // Validate login persistence
        try {
            WebElement profileName = driver.findElement(By.xpath("//div[contains(text(),'Ishwari Mote')]"));
            System.out.println("Logged-in user: " + profileName.getText());
        } catch (NoSuchElementException e) {
            System.out.println("Login failed, session was not restored.");
        }
        // OR
        // Assertion 1: Verify the page title
        
        //  Initialize SoftAssert
        SoftAssert softAssert = new SoftAssert();
		/*
		 * String actualTitle = driver.getTitle(); String expectedTitle =
		 * "Ishwari Mote"; // Assumed title, check actual title
		 * softAssert.assertEquals(actualTitle, expectedTitle, "Title mismatch!");
		 */
        
		/*
		 * // Close the browser
		 *  driver.quit();
		 */
        // Assertion 2: Verify if the Profile Name is displayed
        WebElement profileName = driver.findElement(By.xpath("//div[text()='Ishwari Mote']"));
        softAssert.assertTrue(profileName.isDisplayed(), "Profile name is NOT visible!");
        
    }
}
