package coreJavaConcepts;

class Employee {
    String name;
    int age;

    // Constructor with parameters having the same names as instance variables
    public Employee(String name, int age) {
        // Use 'this' to refer to instance variables
        this.name = name;  // this.name refers to the instance variable
        this.age = age;    // this.age refers to the instance variable
    }

    public void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

