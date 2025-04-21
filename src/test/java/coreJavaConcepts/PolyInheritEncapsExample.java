package coreJavaConcepts;

//Parent class P
class P {
 private int value;  // Encapsulated variable (private)

 // Getter method to access private variable
 public int getValue() {
     return value;
 }

 // Setter method to modify private variable
 public void setValue(int value) {
     this.value = value;//this: Refers to the current class instance.
 }

 void m1(int X) {
     System.out.println(X);
 }

 void m2(int Z) {
     System.out.println(Z);
 }
}

//Child class Z extending X
class S extends P {
 @Override
 void m1(int X) {
     System.out.println(X * X);
 }
//overload 
 void m2(int X, int Z) {
     System.out.println(X * Z);
 }

 public static void main(String[] args) {
     P obj1 = new P();
     obj1.setValue(10);  // Setting value using setter
     System.out.println("Encapsulated Value in obj1: " + obj1.getValue()); // Getting value using getter

     obj1.m1(3);   // Output: 3
     obj1.m2(2);   // Output: 2

     S obj2 = new S();
     obj2.setValue(20);  // Setting encapsulated value for obj2
     System.out.println("Encapsulated Value in obj2: " + obj2.getValue());

     obj2.m1(3);   // Output: 9  (Overridden method in Z)
     obj2.m2(2);  // Output: 2  (Inherited from X)
     obj2.m2(3, 2); // Output: 6  (Overloaded method in Z)
 }
}

