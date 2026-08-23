public class CopyArray {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];

        // Copy arr1 into arr2
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.print("Original Array: ");

        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Copied Array: ");

        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
