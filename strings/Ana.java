package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ana {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = in.nextLine();
        System.out.print("Enter second string: ");
        String str2 = in.nextLine();

        boolean chk = isAnagram(str1, str2);
        if (chk) {
            System.out.println("It is Anagram");

        } else {
            System.out.println("No");
        }
    }

    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        str1.toLowerCase();
        str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;

    }
}