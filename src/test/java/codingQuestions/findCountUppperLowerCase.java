package codingQuestions;

public class findCountUppperLowerCase {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String str ="Welcome TO JAva Interview ";
			int countL=0, countU=0;
		
			for (int i = 0; i<str.length();i++) {
				
				char ch = str.charAt(i);
				
				if (ch > 'A' && ch < 'Z') {
					countU++;
					System.out.println();
				}
				else  {
					countL++;
				}
			}
			
		System.out.println("Lower count: " +countL);
			 
		System.out.println("Upper count: " +countU);
	
	}
}
