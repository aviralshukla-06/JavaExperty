package Alpha;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str = "Bhai";
        String str2 = "Bhai";

        if (isAnagram(str, str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        return Arrays.equals(arr, arr2);
    }
}