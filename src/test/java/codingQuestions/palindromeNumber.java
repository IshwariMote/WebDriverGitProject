package codingQuestions;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner (System.in);
		
		System.out.println("Entre No. for Palindrome :");
		
		int num = scr.nextInt();
		int rev= 0;
		int orig= num;
		
		
		
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
