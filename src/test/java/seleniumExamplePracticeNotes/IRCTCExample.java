package seleniumExamplePracticeNotes;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IRCTCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 WebDriver driver = new ChromeDriver();
		 
		 
		 try {
			 driver.get("https://www.irctc.co.in/nget/train-search");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
				
			 driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("Pune");
			 driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Mumbai");
			 
			 
				/*
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * 
				 * WebElement dateField =
				 * driver.findElement(By.xpath("//input[text()='DD/MM/YYYY *']"));
				 * js.executeScript("arguments[0].value='20/03/2025';", dateField);
				 */
			 
			 driver.findElement(By.xpath("(//span[text()='All Classes'])[1]")).click();
			 driver.findElement(By.xpath("(//span[text()='GENERAL'])[1]")).click();
			 
			// driver.findElement(By.xpath("//label[text()='Train with Available Berth ']")).click();
			 
			// driver.findElement(By.xpath("//button[text()='Search']")).click();
			 
			 
			 
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 
			 WebElement SearchButton = driver.findElement(By.xpath("//button[@type='submit' and text()='Search']"));
			 js.executeScript("arguments[0].click();", SearchButton);
			 js.executeScript("arguments[0].click();",  driver.findElement(By.xpath("//button[@type='submit' and text()='Search']")));
			 
			 System.out.println("Search on click button successfully .... ");
			 
			 
			
			// Find the Search button
			
			 
			WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit' and text()='Search']"));

			// Using Actions class to click
			Actions actions = new Actions(driver);
			actions.moveToElement(searchButton).click().perform();
			 System.out.println("Search on click button successfully using action class  .... ");
			
			 List<WebElement> links = driver.findElements(By.tagName("a"));
			 System.out.println("Links present in this page are : "+links.size());
			 
			 for (WebElement allLinks : links) {
				 
				 System.out.println(allLinks.getText());
			 }
			 
			 for (int i = 0; i < 10 && i < links.size(); i++) {
			     System.out.println(links.get(i).getText());
			 }

			 
			 
			 driver.get("https://www.irctc.co.in/nget/train-search");
			 List<WebElement> trainList =	 driver.findElements(By.xpath("//div[@class='dull-back no-pad col-xs-12']"));
			 
			for (WebElement Names : trainList) {
				
				System.out.println(Names.getText());
				
			}
			 
			 
			 
		 }finally{
			 
			 driver.quit();
			 
		 }
		
		 


	}

}
