package codingQuestions.NumberCodes;

public class GreatestOfThree {
	
	    public static void main(String[] args) {
	        int a = 10, b = 25, c = 15;
	      //			  condition ? value_if_true : value_if_false;
	        int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
	        
	        System.out.println("Greatest number is: " + greatest);
	    }
	}

}
