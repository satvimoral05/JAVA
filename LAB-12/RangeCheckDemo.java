class OutOfRangeException extends Exception {

    public OutOfRangeException(String message) {
        super(message);
    }
}

public class RangeCheckDemo {

    public static void main(String[] args) {

        int num = 55;

        try {

            if (num < 10 || num > 50) {

                throw new OutOfRangeException(
                    "Number is out of range (10-50)."
                );

            } else {

                int square = num * num;

                System.out.println(
                    "Square of " + num + " is: " + square
                );
            }

        } catch (OutOfRangeException e) {

            System.out.println(
                "Caught Exception: " + e.getMessage()
            );
        }
    }
}
