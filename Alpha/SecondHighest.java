package Alpha;

import java.util.Scanner;

public class SecondHighest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arrSize = in.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = in.nextInt();
        }

        SecondHighest mynum = new SecondHighest();
        mynum.findNum(arr);
        // System.out.println(ans);
    }

    public void findNum(int[] arr) {
        // if(arr.length == 1){
        // return arr[0];
        // }

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] < max) {
                second_max = arr[i];
            }
        }
        System.out.println(second_max);
        return;
    }
}