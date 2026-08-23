// Write a program to calculate the area of Rectangle

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("Area of Rectangle = " + area);

        sc.close();
    }
}
