package coreJavaConcepts;

/*try: Block where the code that might throw an exception is placed.
catch: Block where the exception is handled.
finally: Block that executes whether an exception is thrown or not.
throw: Used to manually throw an exception.*/


public class tryCatchBlock {
	
    public static void main(String[] args) {
        try 
        {
            int result = 10 / 0;  // This will throw an exception
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } 
        finally {
            System.out.println("Finally block executed");
        }
    }
}

