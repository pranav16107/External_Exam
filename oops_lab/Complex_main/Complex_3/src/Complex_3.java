class Buffer {
    int data;
    boolean available = false;
    synchronized void produce(int n) {
        try {
            while (available)
                wait();
            data = n;
            System.out.println("Produced: " + data);
            available = true;
            notify();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    synchronized void consume() {
        try {
            while (!available)
                wait();
            System.out.println("Consumed: " + data);
            available = false;
            notify();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Producer extends Thread {
    Buffer b;
    Producer(Buffer b) {
        this.b = b;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++)
            b.produce(i);
    }
}
class Consumer extends Thread {
    Buffer b;
    Consumer(Buffer b) {
        this.b = b;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++)
            b.consume();
    }
}
public class Complex_3 {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
    }
}