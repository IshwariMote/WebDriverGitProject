package seleniumExamplePracticeNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class softAssertionExample {
    public static void main(String[] args) {
        // Step 1: Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.naukri.com/nlogin/login");

        // Step 2: Perform Login
        driver.findElement(By.id("usernameField")).sendKeys("ishwarimote22@gmail.com");
        driver.findElement(By.id("passwordField")).sendKeys("Ishwari@22");
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

        // Wait for the profile page to load
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Step 3: Initialize SoftAssert
        SoftAssert softAssert = new SoftAssert();

        // Step 4: Validate multiple elements on the profile page

        // Assertion 1: Verify the page title
        String actualTitle = driver.getTitle();
        String expectedTitle = "Ishwari Mote";  // Assumed title, check actual title
        softAssert.assertEquals(actualTitle, expectedTitle, "Title mismatch!");

        // Assertion 2: Verify if the Profile Name is displayed
        WebElement profileName = driver.findElement(By.xpath("//div[contains(@class, 'Ishwari Mote')]"));
        softAssert.assertTrue(profileName.isDisplayed(), "Profile name is NOT visible!");

        // Assertion 3: Check if the "Resume Upload" section is present
        WebElement resumeUpload = driver.findElement(By.xpath("//input[@id='attachCV']"));
        softAssert.assertTrue(resumeUpload.isDisplayed(), "Resume upload button is missing!");

        // Assertion 4: Check if "Update Profile" button is enabled
        WebElement updateProfileBtn = driver.findElement(By.xpath("//button[contains(text(),'Update Profile')]"));
        softAssert.assertTrue(updateProfileBtn.isEnabled(), "Update Profile button is disabled!");

        // Step 5: Assert all (This will collect all assertion results and report failures)
        softAssert.assertAll();

        // Close the browser
        driver.quit();
    }
}
