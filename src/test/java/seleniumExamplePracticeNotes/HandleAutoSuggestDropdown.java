package seleniumExamplePracticeNotes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAutoSuggestDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriver driver = new ChromeDriver();
	
		// Step 1: Open Google
		driver.get("https://www.google.com");

		// Step 2: Type partial text in the search box
		driver.findElement(By.name("q")).sendKeys("Selenium");

		// Step 3: Wait for suggestions to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']//li")));

		// Step 4: Capture all suggestions and select the one you want
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));

		for (WebElement suggestion : suggestions) {
		    if (suggestion.getText().equalsIgnoreCase("selenium webdriver")) {
		        suggestion.click();
		        break;
		    }
		}

	}

}
