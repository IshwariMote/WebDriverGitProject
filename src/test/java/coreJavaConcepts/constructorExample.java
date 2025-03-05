package coreJavaConcepts;

public class constructorExample {


	
	  int a1 ; int a2; int z;
	  
	  
	  // no return type void 
	  constructorExample(){
	  
	  a1 =101; 
	  a2 = 130;
	  
	  }
	  
	  constructorExample(int x , int y){
		  a1 = x ; a2 = y ;
	  
	  }
	  // this keyword used to indicate class variables or instance variables
	  constructorExample(int a1 , int a2, double a3){
		 this.a1= a1;
		 this.a2= a2;
		 a3 = z;
	  
	  }  
	  
	  void sum() 
	  { 
		  System.out.println(a1+a2); 
		  
	  
	  } 
	  
	  
	  public static void main(String[] args) { 
		  
		  // TODO Auto-generated method stub
	  
	  constructorExample defaultCon = new constructorExample(); 
	  defaultCon.sum();
	  
	  constructorExample paraCon = new constructorExample(300,200); 
	  paraCon.sum();
	  
	  constructorExample obj2 = new constructorExample(10,20,20.20);
	  obj2.sum();
	  
	  
	  }
	 

	/*Class /*Car {
	    String model;
	    int year;

	    // Default constructor
	    Car() {
	        model = "Unknown";
	        year = 0;
	    }

	    // Parameterized constructor
	    Car(String model, int year) {
	        this.model = model;
	        this.year = year;
	    }*/
	}



