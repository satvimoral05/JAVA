public class BinarySearch {

    public static int findNum(int[] arr, int si, int ei, int target) {

        while (si <= ei) {

            int mid = (si + ei) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (arr[si] <= arr[mid]) {

                if (target >= arr[si] && target <= arr[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }

            }

            // Right half is sorted
            else {

                if (target >= arr[mid] && target <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int target = 0;

        int si = 0;
        int ei = arr.length - 1;

        System.out.println(
            "Target found at index: " + findNum(arr, si, ei, target)
        );
    }
}
