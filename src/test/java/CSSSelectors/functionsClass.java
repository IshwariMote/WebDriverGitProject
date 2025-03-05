package CSSSelectors;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;

public class functionsClass {
	
	public void LoginPhoneNo(WebDriver driver) {

		Scanner scr= new Scanner (System.in);
		System.out.println("Enter Your Phone Number for Registration: ");
		String PhoneNo=scr.nextLine();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(PhoneNo);
		driver.findElement(By.xpath("//span [text()='Continue']")).click();
	}

	

}
