package codingQuestions;

public class factorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		
		long fact=1;
		
		/*
		 * for (int i=1; i<=num; i++) { fact= fact*i; }
		 */
		System.out.println("Factorial of a number is :"+fact);
	 //OR 
	 
		for (int i =num; i>=1; i--) {
			fact= fact*i;
		}
	
		System.out.println("Factorial of a number is :"+fact);
	
	}

	
}
