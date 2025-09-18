package sliding_window;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContigiousSumArray {

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
        List<Float> myList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            float currSum = sum;

            currSum += arr[i];
            currSum -= arr[i - k];
            currSum /= k;
            myList.add(currSum);
            // sum = Math.max(currSum, sum);
            System.out.println(currSum);
        }
        for (int num = 0; num < myList.size(); num++) {
            System.out.print(myList.get(num));
        }
        // System.out.println(sum);
    }
}