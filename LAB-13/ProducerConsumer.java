// 4. Write a program to implement the solution to
// Producer Consumer problem in Java. [B]

class Buffer {

    private int item;
    private boolean available = false;

    // Producer puts item into buffer
    synchronized void produce(int value) {

        // If item already exists, producer waits
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        item = value;

        System.out.println("Produced: " + item);

        available = true;

        // Notify consumer
        notify();
    }

    // Consumer takes item from buffer
    synchronized int consume() {

        // If no item, consumer waits
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + item);

        available = false;

        // Notify producer
        notify();

        return item;
    }
}

class Producer extends Thread {

    Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        int value = 1;

        while (true) {

            buffer.produce(value++);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {

    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        while (true) {

            buffer.consume();

            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
