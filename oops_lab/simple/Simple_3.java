// Write a Java program to implement constructor overloading.
public class Simple_3 {
    // Default constructor
    Simple_3() {
        System.out.println("Default Constructor");
    }
    // Constructor with one parameter
    Simple_3(int a) {
        System.out.println("Value of a: " + a);
    }
    // Constructor with two parameters
    Simple_3(int a, int b) {
        System.out.println("Sum of a and b: " + (a + b));
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Simple_3 obj1 = new Simple_3();
        Simple_3 obj2 = new Simple_3(10);
        Simple_3 obj3 = new Simple_3(10, 20);
    }
}