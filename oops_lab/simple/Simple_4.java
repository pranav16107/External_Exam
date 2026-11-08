// Write a program to demonstrate:
// i) Single inheritance
// ii) Multi-level inheritance
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
// ! Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
// ! Multi-level Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}
public class Simple_4 {
    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multi-level Inheritance
        System.out.println("\nMulti-level Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}