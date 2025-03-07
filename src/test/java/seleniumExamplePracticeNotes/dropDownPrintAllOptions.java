package seleniumExamplePracticeNotes;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropDownPrintAllOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver ();
		
		 driver.get("https://the-internet.herokuapp.com/dropdown");
		 // Locate the dropdown element
		Select dropdown = new Select ( driver.findElement(By.id("dropdown"))); 
		// Use the Select class to interact with the dropdown 
		//Select dropdown = new Select(dropdownElement);
		 // Get all options in the dropdown
		 System.out.println("Dropdown Options:");
		 List <WebElement> l = dropdown.getOptions();
		 
		for (WebElement option : l) 
		{ 
		// Print the text of each option
		 System.out.println(option.getText());
		}

		driver.quit();
		}

}
