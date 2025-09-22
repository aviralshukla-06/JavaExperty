package sliding_window;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstNegative {

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
        negative(arr, k);

    }

    static void negative(int[] arr, int k) {
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            for (int j = i; j < i + k; j++) {

                if (arr[j] < 0) {
                    myList.add(arr[j]);
                    break;
                }
            }
        }

        for (int i : myList) {
            System.out.println(i + " ");
        }
    }
}