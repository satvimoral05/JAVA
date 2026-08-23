// Write a program to replace all "word1" by "word2" from a file1,
// and output is written to file2 and display the number of replacements.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReplaceWord {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            BufferedWriter bw = new BufferedWriter(
                new FileWriter("demo.txt")
            );

            int noOfReplacement = 0;

            String str;

            while ((str = br.readLine()) != null) {

                int count = str.split("word1", -1).length - 1;
                noOfReplacement += count;

                String newStr = str.replace("word1", "word2");

                bw.write(newStr);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println(
                "Number of replacements: " + noOfReplacement
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
