class OddThread extends Thread {

    public void run() {

        for (int i = 1; i <= 20; i += 2) {

            System.out.println("Odd: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class EvenThread extends Thread {

    public void run() {

        for (int i = 2; i <= 20; i += 2) {

            System.out.println("Even: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class OddEvenThreads {

    public static void main(String[] args) {

        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();

        odd.start();
        even.start();
    }
}
