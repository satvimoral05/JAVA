import java.util.Scanner;

public class StringLen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(
            "Length of String: " + str.length()
        );

        System.out.println(
            "Second half of String: "
            + str.substring(str.length() / 2)
        );

        sc.close();
    }
}
