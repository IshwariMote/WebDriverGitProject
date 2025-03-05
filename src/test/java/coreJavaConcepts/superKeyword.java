package coreJavaConcepts;

	//Superclass
	class superClassColor {
	 String colorName;
	
	 // Constructor in the superclass
	 public superClassColor(String colorName) {
	     this.colorName = colorName;
	 }
	
	 // Method in the superclass
	 public void displayColor() {
	     System.out.println("The color is: " + colorName);
	 }
	}
	
	//Subclass
	class Shade extends superClassColor {
	 String shadeName;
	
	 // Constructor in the subclass
	 public Shade(String colorName, String shadeName) {
	     super(colorName);  // Call to the superclass constructor
	     this.shadeName = shadeName;
	 }
	
	 // Overriding the displayColor method
	 @Override
	 public void displayColor() {
	     super.displayColor();  // Calling the superclass method
	     System.out.println("The shade of the color is: " + shadeName);
	 }
	}
	
	public class superKeyword {
	 public static void main(String[] args) {
	     // Create an object of the subclass
	     Shade shade = new Shade("Blue", "Sky Blue");
	
	     // Call the displayColor method from the subclass
	     shade.displayColor();
	 }
	}
	
