import java.util.Scanner;

public class DivisionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(sc.nextLine());

            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {

            System.out.println(
                "Invalid input! Please enter integers only."
            );

        } catch (ArithmeticException e) {

            System.out.println(
                "Division by zero is not allowed."
            );
        }

        sc.close();
    }
}
