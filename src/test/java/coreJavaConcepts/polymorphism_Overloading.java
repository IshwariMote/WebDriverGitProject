package coreJavaConcepts;

// have multiple forms , means methods have same name with diff data types or changing in no. of parameters 
// also called method overloading or Compile time polymorphism

public class polymorphism_Overloading {

		int a ;
		int b;
		
		void  add () {
			System.out.println(a+b);
	
		}
		
		void add (int x , int y, int z) {
			System.out.println(x+y+z);
		}
		
		void add (int s , double d) { 
			System.out.println(s+d);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		polymorphism_Overloading obj = new polymorphism_Overloading();
		obj.add();
		obj.add(2,30);
		obj.add(10,1.1);
		
	}

}
