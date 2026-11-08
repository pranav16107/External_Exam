package oops_lab.complex;

import java.util.Scanner;
class Student {
    int rollno;
    String name;
    void getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
    }
}
class Academic extends Student {
    int marks;
    void getAcademic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Academic Marks: ");
        marks = sc.nextInt();
    }
}
interface Sports {
    int sportsMarks = 10;
}
class Result extends Academic implements Sports {
    void display() {
        int total = marks + sportsMarks;
        System.out.println("\n----- Student Result -----");
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Academic Marks: " + marks);
        System.out.println("Sports Marks: " + sportsMarks);
        System.out.println("Final Marks: " + total);
    }
}
public class Complex_10 {
    public static void main(String[] args) {
        Result r = new Result();
        r.getStudent();
        r.getAcademic();
        r.display();
    }
}