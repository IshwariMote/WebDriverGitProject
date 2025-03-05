package coreJavaConcepts;

public class overloadingConstructor {
    String name;
    int age;

    // Constructor with no parameters
    public overloadingConstructor() {
        name = "Riya";
        age = 20;
    }

    // Constructor with one parameter
    public overloadingConstructor(String name) {
        this.name = name;
        age = 0; // Default age
    }

    // Constructor with two parameters
   // Constructor with parameters having the same names as instance variables
   
    
    
    public overloadingConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }



    public static void main(String[] args) {
        // Using different constructors
    	overloadingConstructor p1 = new overloadingConstructor();
    	overloadingConstructor p2 = new overloadingConstructor("John");
    	overloadingConstructor p3 = new overloadingConstructor("Alice", 25);

        p1.display();  // Output: Name: Unknown, Age: 0
        p2.display();  // Output: Name: John, Age: 0
        p3.display();  // Output: Name: Alice, Age: 25
    }

}