package coreJavaConcepts;

// Step 1: Create an Interface (Defines rules for all browsers)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

interface BrowserActions {
    void openBrowser();
    void closeBrowser();
}

// Step 2: Create an Abstract Class (Provides common setup)
abstract class BaseTest implements BrowserActions {
    WebDriver driver;

    // Concrete method (common for all browsers)
    public void maximizeWindow() {
        driver.manage().window().maximize();
        System.out.println("Window maximized");
    }

    // Abstract method (must be implemented by child classes)
    abstract void navigateToURL(String url);
}

// Step 3: Create a Concrete Class (Implements Chrome Browser)
class ChromeTest extends BaseTest {
    // Implementing the interface methods
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        System.out.println("Chrome Browser Opened");
    }

    public void closeBrowser() {
        driver.quit();
        System.out.println("Chrome Browser Closed");
    }

    // Implementing the abstract method
    public void navigateToURL(String url) {
        driver.get(url);
        System.out.println("Navigated to: " + url);
    }

    public static void main(String[] args) {
        ChromeTest test = new ChromeTest();
        test.openBrowser();  // Calls openBrowser() from the interface
        test.maximizeWindow(); // Calls the concrete method from Abstract Class
        test.navigateToURL("https://www.google.com"); // Implemented method
        test.closeBrowser(); // Calls closeBrowser() from the interface
    }
}
