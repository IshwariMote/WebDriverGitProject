package coreJavaConcepts;

//Abstract class - can have abstract and non- abstarct methods 
abstract class Shape {
 // Abstract method (no body, only declaration)
 abstract void draw();

	/*
	 * // Concrete method public void description() {
	 * System.out.println("This is a shape"); }
	 */
}

//Subclass providing implementation for abstract method
class Circle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a circle");
 }
}

public class AbstractExample {
 
 public static void main(String[] args) {
     // Shape s = new Shape();  // Error! Cannot instantiate an abstract class

     // Creating objects of subclasses
    // Shape circle = new Circle();
	 
	 Circle obj = new Circle();
  

     // Calling methods
    // circle.description();  // Output: This is a shape
     obj.draw();         // Output: Drawing a circle
 }
   

}
