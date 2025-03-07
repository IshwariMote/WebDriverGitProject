package seleniumExamplePracticeNotes;

import java.awt.*;
import java.awt.event.KeyEvent;

public class robotClass_Example {
    public static void main(String[] args) throws AWTException {
        // Create an instance of the Robot class
        Robot robot = new Robot();

        // Delay for observation
        robot.delay(2000); // 2-second delay

        // Simulate pressing and releasing keys (e.g., typing "HELLO")
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);

      robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);

        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);

        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);

        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);

        System.out.println("Typed 'HELLO' using Robot class.");
    }
}
