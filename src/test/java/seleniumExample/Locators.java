package seleniumExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//driver.navigate().refresh();
		//name
		driver.findElement(By.name("search")).sendKeys("mac");
		
		//by id 
		boolean logoDisplayed =driver.findElement(By.id("logo")).isDisplayed();// isDisplayed - show true or false - if logo is displayed or not ?
		System.out.println(logoDisplayed);
		
		//Locating LinksText and partialLinkText
		// tag a - represent link with associated with href -- target page of the link-- link test
		// inner text -
		
		//driver.findElement(By.linkText("Tablets") ).click();
		
		//link text vs partial link text - interview 
		 //only pass partial part of the link text   -- but some times it match have multiple values having same text - so partialLinkText not that 
		/* driver.findElement(By.partialLinkText("Tabl") ).click(); */
		// findElement - will return single we element so type of variable will be Web Element
		//-----------------------TagName/Class------------------------
		
		//Capture multiple elements 
		//findElements - will return multipe/ Group elements so type of varible will be List collection and  can have duplicate 
		
		//-----------------------ClassName
		
		  List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		  System.out.println("Total number of header links: "+headerLinks.size());
		 
		
		//---------------------TagName
	List <WebElement>	totalLinks= driver.findElements(By.tagName("a")); //Return all the links
	System.out.println("Total number of Links on page : "+totalLinks.size());	
		
	
	List <WebElement>totalImg= driver.findElements(By.tagName("img"));
	System.out.println("Total number of img on page : "+totalImg.size());	
	
	//----------------getText()---------------------

    // Locate the element (Assume it's a heading with id 'main-heading')
    WebElement heading = driver.findElement(By.id("main-heading"));

    // Use getText() to retrieve the text of the heading
    String headingText = heading.getText();

    // Print the retrieved text
    System.out.println("Heading text is: " + headingText);
    
	
	//interview - findElemets vs findElement - prep 
	
	
		//close
		driver.close();
		
		
	//	----------------------------------------------dynamic elements----------------------------------------------------------------------------------------------------
		// Find element using part of its text or an ancestor/descendant relationship.
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));

		// Find element by attribute value.
		WebElement element1= driver.findElement(By.cssSelector("button[class*='submit-button']"));

		WebElement element2 = driver.findElement(By.xpath("//input[contains(@id, 'dynamicPartOfID')]"));

		WebElement element3 = driver.findElement(By.xpath("//button[starts-with(@id, 'startOfDynamicID')]"));

	
	}

}
