package codingQuestions.NumberCodes;

public class PrintEvenNOddNoInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 100;
		
		System.out.println("Even No in Reverse Order: ");
		for (int i=n; i>=0; i-=2) {
			
			System.out.println(i);
			
		}
		System.out.println("Odd No in Reverse Order :");
		
		for (int i=n-1; i>=0; i-=2) {
			System.out.println(i);
		}
		
		

	}

}
