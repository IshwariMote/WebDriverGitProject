package coreJavaConcepts.QuestionEx;


//Can a subclass access private members of a superclass?
//
//No, private members are not accessible outside the class, including from a subclass.
//For example, if class Parent has a private variable, class Child extending Parent cannot directly access that variable. 
//You can provide access through public or protected getter/setter methods in the parent class to allow controlled access.

	
	class Parent {
	    private int secretCode = 1234;
	    public int getSecretCode() {
	        return secretCode;
	    }
	}

	class Child extends Parent {
	    void displayCode() {
	        // System.out.println(secretCode); ❌ Compile-time error
	        System.out.println(getSecretCode()); // ✅ Correct way
	    }



    public static void main(String[] args) {
		        Child child = new Child();
		        child.displayCode();
		    }
		}
	


