package sliding_window;

import java.util.Scanner;

public class MaxSumArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lengthn of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the window size: ");
        int k = in.nextInt();
        System.out.println("Enter the array values:");

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        maxSum(arr, k);
    }

    static void maxSum(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            int currSum = sum;

            currSum += arr[i];
            currSum -= arr[i - k];
            sum = Math.max(currSum, sum);
            // System.out.println(sum);
        }

        System.out.println(sum);
    }
}