class A {

    int[] arr = {10, 5, 20, 15, 25};

    public void sortArray() {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public void searchArray(int key) {

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(
                "Element " + key + " found in array."
            );
        } else {
            System.out.println(
                "Element " + key + " not found."
            );
        }
    }

    public void SumArray() {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of Array = " + sum);
    }

    public void avgArray() {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("Average of Array = " + avg);
    }
}

public class ArrayDemo {

    public static void main(String[] args) {

        A na = new A();

        na.sortArray();
        na.searchArray(15);
        na.SumArray();
        na.avgArray();
    }
}
