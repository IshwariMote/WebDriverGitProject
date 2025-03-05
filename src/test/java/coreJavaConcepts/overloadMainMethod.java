package coreJavaConcepts;

public class overloadMainMethod {
	double a;
	int b;
	
	void main(String z) {
		System.out.println(z);
	}
	
	void main(double x , int y) {
	
		this.a= x;
		this.b=y;
		System.out.println(a*b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloadMainMethod obj= new overloadMainMethod();
		obj.main("Hello");
		
		obj.main(20,30);
		
		
	}

}
