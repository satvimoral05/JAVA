// Write a program that prompts the user to enter three numbers.
// Find the largest number.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = 0;

        if (a > b) {
            if (a > c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b > c) {
                largest = b;
            } else {
                largest = c;
            }
        }

        System.out.println("Largest of three is: " + largest);

        sc.close();
    }
}
