package strings;

import java.util.Scanner;

public class MaxOccur {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = in.nextLine();

        counter(str1);
    }

    static void counter(String str) {
        int[] times = new int[26];
        str = str.toLowerCase();
        int maxCount = Integer.MIN_VALUE;
        char maxChar = ' ';
        // int count = 1;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if (times[val] == 0) {
                times[val] = 1;
            } else {
                times[val] += 1;
            }
        }

        for (int i = 0; i < times.length; i++) {
            if (times[i] > maxCount) {
                maxCount = times[i];
                maxChar = (char) (i + 'a');
            }
        }
        System.out.print(maxChar + " : " + maxCount);
    }
}