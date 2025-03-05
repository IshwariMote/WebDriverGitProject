package Demo1st;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://www.opencart.com/");
		// match title 
		String urlTitle =driver.getTitle();
		
		if (urlTitle.equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		driver.close();
		
	}

}
