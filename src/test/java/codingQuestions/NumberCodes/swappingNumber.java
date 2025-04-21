package codingQuestions.NumberCodes;

public class swappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 10 ;
		int b= 20 ;
	//	int c = 30;
		
		System.out.println("Before SWAP: "+a +" and "+b);
		// 3rd variable 
		int temp = a;
		a=b;
		b=temp ;
		
		System.out.println("Using 3rd Var: "+a +" and "+b);
		
		// without 3rd variable 
		
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("Without 3rd Var: "+a +" and "+b);	
		
		
	}

}
