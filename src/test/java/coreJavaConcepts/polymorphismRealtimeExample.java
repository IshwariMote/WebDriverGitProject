package coreJavaConcepts;
//Abstract class representing a generic Web Element
abstract class WebElement {
 public abstract void performAction(); // Abstract method for polymorphic behavior
}

//Subclass for Button
class Button extends WebElement {
 @Override
 public void performAction() {
     System.out.println("Clicking the button.");
 }
}

//Subclass for TextField
class TextField extends WebElement {
 @Override
 public void performAction() {
     System.out.println("Entering text into the text field.");
 }
}

//Subclass for Checkbox
class Checkbox extends WebElement {
 @Override
 public void performAction() {
     System.out.println("Checking the checkbox.");
 }
}

//Main class to demonstrate polymorphism
public class polymorphismRealtimeExample {
 public static void main(String[] args) {
     // Create instances of different web elements
     WebElement button = new Button();
     WebElement textField = new TextField();
     WebElement checkbox = new Checkbox();

     // Perform actions directly on web elements
     button.performAction();      // Output: Clicking the button.
     textField.performAction();  // Output: Entering text into the text field.
     checkbox.performAction();   // Output: Checking the checkbox.
 }
}
