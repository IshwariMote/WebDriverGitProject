package codingQuestions.NumberCodes;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 12345;
		int rev=0;
	//	int original =num;
		while (num!=0) {
			rev = rev*10+ num % 10; //% - extract the last digit
			num= num / 10; //remove the last digit 
			
		}
		
		System.out.println("rev number is :"+rev);
		
	}
	
}
