package codingQuestions.NumberCodes;

public class SumOfDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1235;
		int	digit; int sum =0;
		
		while (num > 0) {
			digit = num%10;  // Extract last digit
			sum = sum + digit; // Add it to sum
			  num = num / 10;   
				 
			
		}
		System.out.println(sum);
	}

}
