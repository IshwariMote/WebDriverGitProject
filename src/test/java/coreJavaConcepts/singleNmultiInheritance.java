package coreJavaConcepts;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

/*
 * class Vehicle { void start() { System.out.println("Vehicle started"); } }
 * 
 * class Car extends Vehicle { void drive() {
 * System.out.println("Car is driving"); } }
 * 
 * 
 * public class singleInheritance { public static void main(String[] args) { Car
 * car = new Car(); car.start(); // Inherited method car.drive(); //
 * Car-specific method } }
 * 
 */


class A {
	int a= 100;
	
	void display(){
		
		System.out.println(a);
		
	}
	
}
	
//single Inheritance
class B extends A {
	
	int b= 200;
	
	void show () {
		System.out.println(b );
	}

}


//Multilevel Inheritance 

class C extends B{
	int c = 300;
	
	void print() {
		System.out.println(c);
	}
}

public class singleNmultiInheritance {
	
		public static void main (String args[]) {
	
					A objA = new A();
					objA.display();
	
					B objB= new B();
					objB.show();
					objB.display();
	
			//Multilevel Inheritance  - C is able to access class B methods and class A methods as B was able to access class A method			
					C objC = new C();
					objC.show();
					objC.display();
					objC.print();
}

}