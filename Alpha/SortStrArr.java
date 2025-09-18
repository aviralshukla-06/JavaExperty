package Alpha;

import java.util.Arrays;

public class SortStrArr {

    public static void main(String[] args) {
        String[] str = { "cat", "apple", "bat", "dog", "zebra", "ant", "bee" };

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (shouldSwap(str[j], str[j + 1])) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(str));

    }

    static boolean shouldSwap(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return true;
        } else if (s1.length() == s2.length()) {
            return s1.compareTo(s2) > 0;
        } else {
            return false;
        }
    }
}