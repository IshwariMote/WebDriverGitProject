package codingQuestions;

public class reverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str ="You will get it ";
		
		String words[]= str.split(" ");
		String revStr="";
		
		System.out.println(words[0]);
		
		for (String w:words) {
			
			String revWords="";
			
					for (int i=w.length()-1;i>=0;i-- ) {
				
						revWords=revWords+w.charAt(i);
				
			}
					revStr=revStr+revWords+" ";
		}
		System.out.println("Reverse string is: "+revStr);


		
	}

}
