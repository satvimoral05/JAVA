import java.util.Scanner;

public class AvgArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number = ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("Average of this array = " + avg);

        sc.close();
    }
}
