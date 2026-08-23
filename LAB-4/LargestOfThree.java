// Write a program to find maximum no from given 3 no. (without if-else).

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number = ");
        int a = sc.nextInt();

        System.out.println("Enter Number = ");
        int b = sc.nextInt();

        System.out.println("Enter Number = ");
        int c = sc.nextInt();

        int d = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Maximum number is = " + d);

        sc.close();
    }
}
