// Write a program to demonstrate the usage of method overriding,
// calling super class constructor in derived class

//  Parent class
class Parent {
    // Parent class constructor
    Parent() {
        System.out.println("Parent class constructor");
    }
    // Parent class method
    void display() {
        System.out.println("This is Parent class method");
    }
}
//Child class
class Child extends Parent {
    // Child class constructor
    Child() {
        super(); // Calling parent class constructor
        System.out.println("Child class constructor");
    }
    // Method overriding
    @Override
    void display() {
        System.out.println("This is Child class method");
    }
}
public class Simple_6 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}