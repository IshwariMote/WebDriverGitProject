package codingQuestions.NumberCodes;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner (System.in);
		
		System.out.println("Entre No. for Palindrome :");
		
		int num = scr.nextInt();
		int rev= 0;
		int orig= num;
		
//		   int digit = num % 10;     // Step 1: Get the last digit
//           rev = rev * 10 + digit;   // Step 2: Append it to the reversed number
//           num = num / 10;           // Step 3: Remove the last digit from original number
		
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("Reverse Number is :"+ rev);
		
		
		if (orig==rev) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		
	}

}
