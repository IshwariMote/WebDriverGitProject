package seleniumExamplePracticeNotes;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkChecker {

    public static void main(String[] args) throws Exception {
        // Setup WebDriver (Make sure chromedriver is in PATH or set using System.setProperty)
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/"); // Replace with your target URL

        List<WebElement> links = driver.findElements(By.tagName("a"));
        int count =0;
        
       	//print title of all links  1st 10 links
        for (int i =0; i>=10; i++) {
        	System.out.println("Title of Links "+links.get(i).getText());
        }
    
    	

        for (WebElement link : links) {
        	
     
//        	getAttribute("href") is a Selenium method that fetches the value of the href attribute of that <a> tag.
//
//        	In HTML, the href attribute holds the destination URL of the link.
//
//        	The result is stored in the String url variable.
//			<a href="https://www.google.com">Google</a>

            String url = link.getAttribute("href");
           
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();
                int responseCode = conn.getResponseCode();
                if (responseCode >= 400) {
                	count++;
                	System.out.println(link.getText());
                    System.out.println(url + " is broken with response code: " + responseCode);
                   
             } 
  //                  else {
//                    System.out.println(url + " is valid");
//                }
//            
        }
        System.out.println("Total broken links are : "+count);
        driver.quit();
    }
}
