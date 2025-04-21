package codingQuestions.StringCodes;

import java.util.Scanner;

public class palindromeString {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner (System.in);
		
		System.out.println("Enter the Number: ");
		
		String str = scr.next();
		 String originalStr= str;
		  String rev="";
		 
		  int len=str.length();
		 
		  for (int i = len-1;i>=0;i--) {
			  rev= rev+str.charAt(i);
			 
		  }
		 
		  System.out.println("Reverse String is: "+rev);
		 
		  if (originalStr.equals(rev)) {
			  System.out.println(originalStr+" is Palindrome");
		  }else {
			  System.out.println(originalStr+" is not Palindrome");
		  }
		
		
	}
	

}
