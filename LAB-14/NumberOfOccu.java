import java.io.FileInputStream;
import java.io.IOException;

public class NumberOfOccu {

    public static void main(String[] args) {

        String fileName = args[0];
        int count = 0;

        try (FileInputStream fis = new FileInputStream(fileName)) {

            int ch;

            while ((ch = fis.read()) != -1) {

                if (ch == '5') {
                    // ASCII value of '5' is 53
                    count++;
                }
            }

            System.out.println("Occurrences of digit 5: " + count);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
