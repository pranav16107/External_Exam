// Write a Java program to create an abstract class Shape
// and calculate the area of Rectangle, Triangle and Circle.

abstract class Shape {

    int a, b;

    // Constructor
    Shape(int x, int y) {
        a = x;
        b = y;
    }

    // Abstract method
    abstract void printArea();
}

// Rectangle class
class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + (a * b));
    }
}

// Triangle class
class Triangle extends Shape {

    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * a * b));
    }
}

// Circle class
class Circle extends Shape {

    Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        System.out.println("Area of Circle: " + (3.14 * a * a));
    }
}

// Main class
public class Simple_7 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(10, 15);
        Circle c = new Circle(7);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}