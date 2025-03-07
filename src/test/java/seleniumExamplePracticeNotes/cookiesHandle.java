package seleniumExamplePracticeNotes;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiesHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().getCookies(); // Get cookies
		driver.manage().addCookie(new Cookie("name", "value")); // Add a cookie
		driver.manage().deleteAllCookies(); // Delete cookies



	}

}
