package Alpha;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 9, 11, 15 };
        int num = 67;

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (num == arr[mid]) {
                System.out.println("Number found at index:  " + (mid + 1));
                found = true;
                return;
            } else if (num > arr[mid]) {
                left = mid + 1;
            } else if (num < arr[mid]) {
                right = mid - 1;
            }

        }

        if (!found) {
            System.out.println("Enter a valid number");
        }
    }
}