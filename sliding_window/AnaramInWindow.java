package sliding_window;

import java.util.Scanner;

public class AnaramInWindow {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lengthn of array: ");
        int n = in.nextInt();
        System.out.print("Enter the lengthn of target: ");
        int k = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array values:");

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        maxSum(arr, k);
    }

    static void maxSum(int[] arr, int k) {
        int maxLen = 0;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k && left < right) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
                System.out.println("True" + " " + maxLen);
            }
        }
    }
}