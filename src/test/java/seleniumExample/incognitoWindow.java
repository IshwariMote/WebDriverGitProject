package seleniumExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incognitoWindow {
	 public static void main(String[] args) {
	 // Create an instance of ChromeOptions
    ChromeOptions options = new ChromeOptions();

    // Add the 'incognito' argument to the ChromeOptions
    options.addArguments("--incognito");

    // Launch Chrome with the options
    WebDriver driver = new ChromeDriver(options);

    // Navigate to a website
    driver.get("https://www.example.com");
    
    
	 }

}
