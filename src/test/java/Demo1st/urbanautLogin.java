package Demo1st;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class urbanautLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver  = new ChromeDriver ();
		
		try {
			
			driver.get("https://urbanaut.app");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
			
		String actualTitle =	driver.getTitle();
		String expectedTitle = "Travel better with Urbanaut";
		Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
			
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("ishwarimote98@gmail.com");
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("12345@abcD");//
		driver.findElement(By.xpath("//button[text()=' Log in ']")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profile_pic")));
		
		WebElement userProfile = driver.findElement(By.id("profile_pic"));
		Assert.assertTrue(userProfile.isDisplayed(), "Login Failed, please enter correct Username and Password");
        System.out.println("Login Successful!");
		
		}catch (Exception e) {
            System.out.println("Test encountered an issue: " + e.getMessage());
        } 
		finally {
			driver.quit();
			System.out.println("");
		}
		

	}

}
