package coreJavaConcepts;

class staticKeyword {
    // Static variable (shared across all instances)
    static int count = 0;

    // Non-static variable (unique for each instance)
    int instanceCount = 0;

    // Static method
    static void displayCount() {
        System.out.println("Static Count: " + count);
    }

    // Constructor increments both static and non-static variables
    staticKeyword() {
        count++;  // Shared among all objects
        instanceCount++;  // Separate for each object
    }

    // Non-static method
    void displayInstanceCount() {
        System.out.println("Instance Count: " + instanceCount);
    }
    
    public static void main(String[] args) {
        // Creating first object
    	staticKeyword obj1 = new staticKeyword();
        obj1.displayInstanceCount();  // Output: Instance Count: 1
        staticKeyword.displayCount(); // Output: Static Count: 1

        // Creating second object
        staticKeyword obj2 = new staticKeyword();
        obj2.displayInstanceCount();  // Output: Instance Count: 1
        staticKeyword.displayCount(); // Output: Static Count: 2
    }
}
