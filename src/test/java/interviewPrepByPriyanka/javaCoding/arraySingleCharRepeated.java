package interviewPrepByPriyanka.javaCoding;

public class arraySingleCharRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "java";
		int count=0;
		char [] a= s.toCharArray();
 
		for (int i =0; i<=a.length-1; i++) {
			if (a[i]=='a') {
		 
				count++;
		 
			}
	 
		}
		
	System.out.println(count);	
	}

}
