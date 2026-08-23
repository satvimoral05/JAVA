import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Upper half
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
