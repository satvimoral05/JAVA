//Command line argument
public class Input{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
 System.out.println("You entered = "+a);

   }
}

//Scanner class
import java.util.Scanner;
public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int a = sc.nextInt();
        System.out.println("You entered = "+a);
        sc.close();
    }
}
