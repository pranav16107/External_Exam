package Simple_9.P2;
import Simple_9.P1.MyInterface;

public class MyClass implements MyInterface {

    @Override
    public void display() {
        System.out.println("Interface method implemented");
    }
}