package coreJavaConcepts;


// run-time polymorphism/dynamic polymarphism 
// overriding - method name is same  and parameters also same only implementation is changes 

//Final, static methods of parent class can not be overriden in subclass
//access qualifier must be same 
class Animal {
    // Method in superclass
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method in the subclass
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class oevrridingMethod {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Animal object
        Animal myDog = new Dog();        // Dog object, but referenced as Animal

        myAnimal.sound();  // Output: Animal makes a sound
        myDog.sound();     // Output: Dog barks (overridden method)
        
        
    }
}
