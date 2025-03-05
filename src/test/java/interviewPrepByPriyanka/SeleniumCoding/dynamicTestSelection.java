package interviewPrepByPriyanka.SeleniumCoding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTestSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.amazon.com/");
		 
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	search.sendKeys("iphone");
	
	WebElement tommrow = driver.findElement(By.xpath("//span [contains(text(),'Get It by Tomorrow')]"));
	
	}

}
