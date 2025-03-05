package interviewPrepByPriyanka.SeleniumCoding;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowSelectFromMultiWindows {

	public static WebDriver driver  ;// have define static because we can use it in any method 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
	
		driver.get("https://seleniumpractise.blogspot.com/2017/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a [text()=' Click here for Google ']")).click();
		driver.findElement(By.xpath("//a [text()=' Click here for Facebook ']")).click();
		driver.findElement(By.xpath("//a [text()=' Click here for Gmail ']")).click();
		
		String parentWindow= driver.getWindowHandle();
		Set <String> windowHandelID= driver.getWindowHandles(); 
		
		// go to opened facebook window 
		
		
		
		for (String Title: windowHandelID) {
			
		String windowTitle= 	driver.getCurrentUrl();
		
		if (windowTitle.contains("facebook.com")) {
			System.out.println("we are on Facebook Page");
			break;
		}
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// open the parent window
		
		driver.switchTo().window(parentWindow);
		System.out.println("Came on Parent Window");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Close all the windows except parentWindow 
		
		for (String handles:windowHandelID ) {
			
			if (!handles.equalsIgnoreCase(parentWindow)) {
				
				   driver.switchTo().window(handles);
				driver.close();
				
				
				
			}
			
		}
		
		System.out.println("Close all the windows, except Parent ");
		
		
	
		
        // Use Iterator to switch to Facebook window
        Iterator<String> ite = windowHandelID.iterator();
        while (ite.hasNext()) {
            String window = ite.next();
            driver.switchTo().window(window);
            String currentUrl = driver.getCurrentUrl();

            if (currentUrl.contains("facebook.com")) {  // Check if it's the Facebook window
                System.out.println("Switched to Facebook window.");
                break;
            }
        }

		
	}

}
