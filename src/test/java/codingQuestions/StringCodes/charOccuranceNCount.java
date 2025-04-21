package codingQuestions.StringCodes;

import java.util.HashMap;
import java.util.Scanner;

public class charOccuranceNCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			String j = "ishwariish";
			char [] a= j.toCharArray();
			int count=1;
			
			HashMap <Character, Integer> obj = new HashMap <>(); 
			
			for (int i=0;i<a.length;i++) {
				if (!obj.containsKey(a[i])) {
					obj.put(a[i], count);
				}else {
					obj.put(a[i], obj.get(a[i])+1);
				}
				
				
			}
			
			for (Character i : obj.keySet()) {
				System.out.println("The Char dupicate  "+i+" -->"+ obj.get(i));
				
			}
			
	
	}
	
}
