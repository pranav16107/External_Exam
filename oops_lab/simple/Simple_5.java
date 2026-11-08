// Write a program to demonstrate:
// i) super
// ii) final keywords
// Parent class
class Parent {
    int a = 10;
    void display() {
        System.out.println("This is Parent class");
    }
}
// Child class
class Child extends Parent {
    int a = 20;
    // final variable
    final int b = 100;
    void show() {
        // Using super to access parent class variable
        System.out.println("Parent variable a: " + super.a);
        // Accessing child class variable
        System.out.println("Child variable a: " + a);
        // Using super to call parent class method
        super.display();
        // Using final variable
        System.out.println("Final variable b: " + b);
    }
}
public class Simple_5 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}