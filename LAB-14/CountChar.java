import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountChar {

    public static void main(String[] args) {

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br =
                 new BufferedReader(new FileReader("sample.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");

                wordCount += words.length;
            }

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (FileNotFoundException e) {

            System.out.println("Error: File not found");

        } catch (IOException e) {

            System.out.println(
                "Error reading file: " + e.getMessage()
            );
        }
    }
}
