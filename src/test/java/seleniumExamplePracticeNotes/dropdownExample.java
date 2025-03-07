package seleniumExamplePracticeNotes;

import java.sql.Time;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class dropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  Have a dropdown and have diff values each as its changing and count as well want to select
		 * 2nd last value from dropdwon . How to select 2nd last option each Time .
		 */
		  WebDriver driver = new ChromeDriver();
		
		Select dropdown = new Select (driver.findElement(By.id("dropdown-id")));

		List <WebElement> l = dropdown.getOptions();
		int s=l.size();
		int SeclastOption = s-2;

		dropdown.selectByIndex(SeclastOption);// selectByIndex -function is used to get option based on index 

		
		// select 2nd option 
		if (s>=2) {
			dropdown.selectByIndex(SeclastOption);
		}
		else {
			System.out.println("Not enouph options in dropdown to select");
		}
	}

}
