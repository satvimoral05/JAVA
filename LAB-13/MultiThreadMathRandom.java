class RandomNumber extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            int num = (int) (Math.random() * 10);

            System.out.println("\nGenerated Number: " + num);

            if (num % 2 == 0) {

                EvenSquare even = new EvenSquare(num);
                even.start();

            } else {

                OddCube odd = new OddCube(num);
                odd.start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class EvenSquare extends Thread {

    int num;

    EvenSquare(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println(
            "Square of " + num + " = " + (num * num)
        );
    }
}

class OddCube extends Thread {

    int num;

    OddCube(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println(
            "Cube of " + num + " = " + (num * num * num)
        );
    }
}

public class MultiThreadMathRandom {

    public static void main(String[] args) {

        RandomNumber r = new RandomNumber();

        r.start();
    }
}
