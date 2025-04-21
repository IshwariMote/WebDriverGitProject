package coreJavaConcepts.QuestionEx;


//this - refers to the current class object. It is used to access current class variables, constructors, and methods.
//
//super - refers to the parent class object. It is used to access superclass methods, constructors, or variables.
//
//	
	class Animal {
	    String sound = "Generic Sound";

	    void makeSound() {
	        System.out.println("Animal makes sound");
	    }
	}

	class Dog extends Animal {
	    String sound = "Bark";

	    void printSounds() {
	        System.out.println(this.sound); // refers to Dog's sound
	        System.out.println(super.sound); // refers to Animal's sound
	    }

	    @Override
	    void makeSound() {
	        super.makeSound(); // calls Animal's makeSound()
	        System.out.println("Dog barks");
	    }

	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.printSounds();
	        dog.makeSound();
	    }
	

}
