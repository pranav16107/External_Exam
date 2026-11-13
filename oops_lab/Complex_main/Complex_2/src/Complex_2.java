import java.util.Random;
class RandomNUmber extends Thread {
    @Override
    public void run() {
        int i=0;
        Random r = new Random();
        while (i<5) {
            int n = r.nextInt(10);
            System.out.println("\nGenerated Number: " + n);
            if (n % 2 == 0) {
                new Square(n).start();
            } else {
                new Cube(n).start();
            }
            try {
                Thread.sleep(1000);
                i++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Square extends Thread {
    int n;
    Square(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println("Square: " + (n * n));
    }
}
class Cube extends Thread {
    int n;
    Cube(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println("Cube: " + (n * n * n));
    }
}
public class Complex_2 {
    public static void main(String[] args) {
        RandomNUmber t = new RandomNUmber();
        t.start();
    }
}