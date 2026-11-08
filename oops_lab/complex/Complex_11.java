package complex;

class Student {
    int id;
    String name;
    // 1. Refers to current class variables
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // 2. Calls current class method
    void display() {
        this.show();
    }
    void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    // 3. Calls current class constructor
    Student() {
        this(101, "Pranav");
    }
    // 4. Passes current object as an argument
    void print(Student s) {
        s.show();
    }
    void send() {
        print(this);
    }
}
public class Complex_11 {
    public static void main(String[] args) {
        Student s = new Student();

        s.display();
        s.send();
    }
}