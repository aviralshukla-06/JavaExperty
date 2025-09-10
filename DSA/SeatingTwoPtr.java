package DSA;

import java.util.Scanner;

public class SeatingTwoPtr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int j = 0;
            for (int k = 1; k < n; k++) {
                if (Math.abs(arr[j]) - Math.abs(arr[k]) == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");

                }
                j++;
            }
        }

    }
}
