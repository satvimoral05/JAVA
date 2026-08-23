// Write a program to check that the given number is prime or not.

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number = ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}
