package seleniumExamplePracticeNotes;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadWithRobot {
    public static void main(String[] args) throws AWTException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Naukri registration page
        driver.get("https://www.naukri.com/registration");

        // Maximize the browser
        driver.manage().window().maximize();

        // Click on the file upload button (opens native Windows dialog)
        WebElement uploadButton = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
        uploadButton.click();

        // Wait for the dialog to open (optional but recommended)
        try {
            Thread.sleep(2000); // Give time for the file picker to appear
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Use Robot Class to handle the file dialog
        Robot robot = new Robot();

        // Copy file path to clipboard
        StringSelection filePath = new StringSelection("C:\\Users\\YourName\\Documents\\resume.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        // Press Ctrl + V to paste file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to confirm upload
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("File uploaded successfully using Robot class!");

        // Close browser
        driver.quit();
    }
}
