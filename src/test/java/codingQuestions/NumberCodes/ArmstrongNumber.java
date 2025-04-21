package codingQuestions.NumberCodes;

public class ArmstrongNumber {

	    public static void main(String[] args) {
	        int num = 153, sum = 0, original = num;
	        while (num > 0) {
	            int digit = num % 10; // extract the last number
	         //   sum += digit * digit * digit;
	            int cube = digit * digit * digit; // Step 1: Cube the digit
	            sum = sum + cube;                // Step 2: Add it to the sum
	            num /= 10; //remove the last number
	        }
	        
	        
	        //System.out.println(original + (original == sum ? " is an Armstrong number" : " is Not an Armstrong number"));
	        
	        if (original==sum) {
	        	System.out.println(original +" is an Armstrong number");
	        	
	        }else {
	        	System.out.println(original +" is not an Armstrong number");
	        	
	        }
	    }
	}


