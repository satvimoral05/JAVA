class DarshanUniException extends Exception {

    public DarshanUniException(String message) {
        super(message);
    }
}

public class CustomException {

    public static void main(String[] args) {

        try {
            int marks = -10;

            if (marks < 0) {
                throw new DarshanUniException(
                    "Marks cannot be negative at Darshan University!"
                );
            }

            System.out.println("Marks entered: " + marks);

        } catch (DarshanUniException e) {

            System.out.println(
                "Caught Exception: " + e.getMessage()
            );
        }
    }
}
