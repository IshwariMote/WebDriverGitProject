package CSSSelectors;

import java.io.File;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cssSelectors {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.makemytrip.com/flights/");
		
		driver.manage().window().maximize();
		
		/*
		 * Scanner scr= new Scanner (System.in);
		 * System.out.println("Enter Your Phone Number for Registration: "); String
		 * PhoneNo=scr.nextLine();
		 */
		
		//driver.findElement(By.xpath("//span[@class='commonModal__close']")).sendKeys();
		
		//Implicit wait - wait for for defined sec and proceeds even element is not found 
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		
		//Explicit wait - won't proceed again till element found
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * 
		 * WebElement element =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated((By.
		 * xpath("//a[@class='headerIcons makeFlex hrtlCenter column active']"))));
		 * element.click();
		 */
		//driver.findElement(By.xpath("//a[@class='headerIcons makeFlex hrtlCenter column active")).click();
		driver.findElement(By.xpath("//input[@id='fromCity' ]")).sendKeys("Mumbai");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		driver.close();
	}

}
