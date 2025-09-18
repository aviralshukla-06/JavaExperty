package sliding_window;

import java.util.Scanner;

public class targetSumWindow {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lengthn of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the window size: ");
        int k = in.nextInt();
        System.out.print("Enter the window target: ");
        int target = in.nextInt();
        System.out.println("Enter the array values:");

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        maxSum(arr, k, target);
    }

    static void maxSum(int[] arr, int k, int target) {
        boolean isTrue = false;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if (sum == target) {
                isTrue = true;
                break;
            }
        }
        if (isTrue) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}