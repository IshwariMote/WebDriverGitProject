package coreJavaConcepts;

class Parent {
	
	int a = 100;
	
	void display() {
		System.out.println(a);
	}
}

class Child1 extends Parent{
	
	int b = 200;
	
	
	void show() {
		System.out.println(b);
	}
}

class Child2 extends Parent {
	
	int c = 300;
	
	void print() {
		System.out.println(c);
	}
	
	
}


public class hierarchyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Parent objP = new Parent ();
		objP.display();
		
		
		Child1 obj1= new Child1();
		obj1.display();
		obj1.show();
		
		
		Child2 obj2= new Child2();
		obj2.display();
		obj2.print();
		
		//Can't access properties of class Child1 as it only inherite property of Parent class 
		//obj2.show();

	}

}
