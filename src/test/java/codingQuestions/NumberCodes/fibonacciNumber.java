package codingQuestions.NumberCodes;

public class fibonacciNumber {
    public static void main(String[] args) {
        int n = 10; // Number of terms to display
        int first = 0, second = 1, next;

        System.out.print("Fibonacci Series: " + first + ", " + second);

        for (int i = 2; i < n; i++) { // Loop starts from 2 as first two numbers are already printed
        	
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        
        System.out.print("\n Fibonacci Series from reverse order " + n );
        for (int i = n; i < 2; i--) { // Loop starts from 2 as first two numbers are already printed
        	
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
            
            System.out.print("Fibonacci Series: " + first + ", " + second);
        }
        
        
        
        
    }
}
