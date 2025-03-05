package windowHandle;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandelBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//getWindowHandle() -- return id of single browser window 
		//getWindowHandles(); --retun multiple bbroweser windows
		
		String windowID= driver.getWindowHandle();
		System.out.println("Single window id using getWindowHandle() Method - " +windowID);
		
		
		//driver.findElement(By.xpath("//a [text()='OrangeHRM, Inc']")).click(); //open another window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
		
		//using set collection having string values - duplicates are not allowed  
	Set<String> windowIDs= driver.getWindowHandles();
		System.out.println("Multiple window ids using getWindowHandles() Method - " +windowIDs);

		//1st method 
		/*
		 * Iterator <String> it =windowIDs.iterator();
		 * 
		 * String parentWindowId = it.next();
		 * System.out.println("parentWindowId :"+parentWindowId); String childWindowId =
		 * it.next(); System.out.println("childWindowId :"+childWindowId);
		 */
		
		
		//2nd Method - using List/ ArrayList - duplicates are allowed
		List<String> windowIDsList = new ArrayList(windowIDs);  //convert set--> List as  duplicates are allowed
		//here List is interface , ArrayList is collection 
	String PrarentID= 	windowIDsList.get(0);//1st windowID - Parent  windowID
	String ChildID = windowIDsList.get(1); // 2nd windowID - Child windowID	
		
		driver.switchTo().window(windowIDsList.get(1));
		
		
		// How to Switch to window using id 
	
	driver.switchTo().window(PrarentID);
	System.out.println("parent Window title"+ driver.getTitle());
	
	driver.switchTo().window(ChildID);
	System.out.println("child Window title"+ driver.getTitle());
		
	
	//for each loop 
	for (String winid:windowIDsList ) {
		
		System.out.println(winid);
		String title = driver.switchTo().window(winid).getTitle();
		
		System.out.println(title);
	}
	
	
	}

}
