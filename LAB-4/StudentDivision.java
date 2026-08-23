// The marks obtained by a student in 5 different subjects are input through the keyboard.
// The student gets a division as per the following rules:
// I. Percentage above or equals to 60 - First division
// II. Percentage between 50 to 59 - Second division
// III. Percentage between 40 and 49 - Third division
// IV. Percentage less than 40 - Fail
// Write a program to calculate the division obtained by the student.

import java.util.Scanner;

public class StudentDivision {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number = ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number = ");
        int b = sc.nextInt();

        System.out.println("Enter 3rd number = ");
        int c = sc.nextInt();

        System.out.println("Enter 4th number = ");
        int d = sc.nextInt();

        System.out.println("Enter 5th number = ");
        int e = sc.nextInt();

        int sum = a + b + c + d + e;
        double per = sum / 5.0;

        if (per >= 60) {
            System.out.println("First class");
        } else if (per >= 50) {
            System.out.println("Second class");
        } else if (per >= 40) {
            System.out.println("Third class");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
