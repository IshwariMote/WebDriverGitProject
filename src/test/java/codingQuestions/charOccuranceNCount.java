package codingQuestions;

import java.util.Scanner;

public class charOccuranceNCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner (System.in);
		System.out.println("Enter the String");
		int count=0;
		String str = scr.nextLine();
		
		char[] chr = str.toCharArray();
		
		for (int i=0; i<str.length();i++) {
			
			for (int j=i+1; j<chr.length;j++) {
				
				if (chr[i]==chr[j]) {
					count++;
					System.out.println("Multiple occurence char:"+chr[i] + " and count is "+count );
				}
			}
		//i	System.out.println(count);n
		}
		
	}

}
