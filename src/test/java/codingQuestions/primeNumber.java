package codingQuestions;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner (System.in);
		
		System.out.println("Entre your no :");
		
		int Num = scr.nextInt();
		
		
		int count =0;
		
		if (Num >1) {
			
			for (int i=1; i<=Num;i++) {
				
				if (Num%i==0) {
					count ++;	
				}
				
				
			}
			
		if (count ==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number ");
		}
		}else 
		{
			System.out.println("Not a Prime Number");
		}
	}

}
