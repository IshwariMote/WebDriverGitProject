package interviewPrepByPriyanka.javaCoding;

import java.util.HashMap;

public class charOccurenceStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using hashMap 
		// values store in key value pair 
		// key are unique 
		
		String s = "IshwariIsh";
		int count=1;
		char [] a= s.toCharArray(); //  i s h w a r r i 
		
		HashMap <Character, Integer >  HashObj = new HashMap<Character, Integer>();
		
		 for (int i =0 ; i <a.length; i++) {
			 if (!HashObj.containsKey(a[i])) {
				 
				 HashObj.put(a[i], count);
				 
			 }else {
				 
				 HashObj.put(a[i], HashObj.get(a[i])+1);//get () - retrives the value of the key a[i]
			 }
			 
		 }
		 
		 for (Character k : HashObj.keySet()) //keySet()- only returns keys 
			 
//			 this below code only returns the repeated char in the string 
//			 if (HashObj.get(k)>1) {
//				 System.out.println(k + " -> " + HashObj.get(k));
//
//			 }
//			 
			 
			 System.out.println(k + " -> " + HashObj.get(k));
			 
	}

}
