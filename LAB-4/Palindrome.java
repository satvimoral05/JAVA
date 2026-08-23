// Write a program to find that given Number is palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number = ");
        int n = sc.nextInt();

        int original = n, rev = 0;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        if (rev == original) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }

        sc.close();
    }
}
