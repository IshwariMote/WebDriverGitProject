package coreJavaConcepts;

// Final class example - This class cannot be inherited
final class FinalClass {
    private final String message = "Hello, this is a final variable!"; // Final variable (constant)

    // Final method - Cannot be overridden
    public final void showMessage() {
        System.out.println(message);
    }
}

// Attempting to extend a final class will cause a compilation error
// class SubClass extends FinalClass {} // ❌ Error: Cannot inherit from final class

class CompositionExample {
    private FinalClass obj = new FinalClass(); // Composition (Using final class)

    public void display() {
        obj.showMessage(); // Accessing method of final class
    }
}

public class FinalAccessQualifier {
    public static void main(String[] args) {
        CompositionExample example = new CompositionExample();
        example.display();

        // Final variable example
        final int num = 100; // Final variable (constant)
        System.out.println("Final variable value: " + num);

        // num = 200; // ❌ Error: Cannot assign a value to final variable 'num'
    }
}
