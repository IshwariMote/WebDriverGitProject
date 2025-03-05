package windowHandle;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputWithoutSendKeys {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('username').value='tomsmith';");
        js.executeScript("document.getElementById('password').value='SuperSecretPassword!';");

        System.out.println("Username: " + driver.findElement(By.id("username")).getAttribute("value"));
        System.out.println("Password: " + driver.findElement(By.id("password")).getAttribute("value"));

        driver.quit();
    }
}
