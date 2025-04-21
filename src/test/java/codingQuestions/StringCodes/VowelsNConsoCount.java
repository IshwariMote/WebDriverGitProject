package codingQuestions.StringCodes;

public class VowelsNConsoCount {
	public static void main(String [] args) {
		String str = "I am Ishwari "; //iaiai //mshwr
		
		String s= str.toLowerCase().trim().replace(" ", "");
		
		int  count= 0 , Vcount=0, Ccount =0;
		
		for (int i =0 ; i<s.length();i++) {
			 
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				Vcount++;			
				
			}else if (s.charAt(i)>='a' && s.charAt(i)<='z' ) {
				Ccount++;
			
			}
			
		
		}
		
		System.out.println( "vowels count is"+ Vcount);
		System.out.println("consonent count is" +Ccount);
		System.out.println(" count is" +s.length());
		System.out.println(s);
		
	}

}
