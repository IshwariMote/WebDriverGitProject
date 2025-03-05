package coreJavaConcepts;
//Defining an interface
interface Animal {
 void sound();  // Abstract method
 void eat();    // Abstract method
}

//Implementing the interface in a class
class Dog implements Animal {
 @Override
 public void sound() {
     System.out.println("Dog barks");
 }
 
 @Override
 public void eat() {
     System.out.println("Dog eats");
 }
}

class Cat implements Animal {
 @Override
 public void sound() {
     System.out.println("Cat meows");
 }

 @Override
 public void eat() {
     System.out.println("Cat eats");
 }
}

//Main class to test the interfaces and implementation
public class interfaceEaxmple {
 public static void main(String[] args) {
     Animal myDog = new Dog(); // Creating an object of Dog class
     Animal myCat = new Cat(); // Creating an object of Cat class

     myDog.sound();  // Dog barks
     myDog.eat();    // Dog eats

     myCat.sound();  // Cat meows
     myCat.eat();    // Cat eats
 }
}
