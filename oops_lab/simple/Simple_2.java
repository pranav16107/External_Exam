// Write a Java program to implement method overloading.
public class Simple_2 {
    // Method with two integer parameters
    void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }
    // Method with three integer parameters
    void add(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }
    // Method with two double parameters
    void add(double a, double b) {
        System.out.println("Sum of two decimal numbers: " + (a + b));
    }
    public static void main(String[] args) {
        Simple_2 obj = new Simple_2();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.5);
    }
}