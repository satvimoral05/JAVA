// Write a program to create basic calculator by getting 2 numbers
// and an operation (+, -, *, /, %) from the user.

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /, %): ");
        String op = sc.next();

        double result = 0;
        boolean valid = true;

        switch (op) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    valid = false;
                }
                break;

            case "%":
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Modulo by zero!");
                    valid = false;
                }
                break;

            default:
                System.out.println("Invalid operation!");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
