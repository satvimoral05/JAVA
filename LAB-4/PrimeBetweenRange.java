// Write a program to print prime numbers between given range

import java.util.Scanner;

public class PrimeBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Starting range = ");
        int a = sc.nextInt();

        System.out.println("Enter ending range = ");
        int b = sc.nextInt();

        for (int i = a + 1; i < b; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
