package strings;

import java.util.Scanner;

public class NoOfSubstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            String subStr = "";

            for (int j = i; j < s.length(); j++) {
                subStr += s.charAt(j);

                boolean isSubstr = true; // reset for every new substring
                int left = 0;
                int right = subStr.length() - 1;

                while (left < right) {
                    if (subStr.charAt(left) != subStr.charAt(right)) {
                        isSubstr = false;
                        break; // no need to check further
                    }
                    left++;
                    right--;
                }

                if (isSubstr) {
                    count += 1;
                }
                // System.out.println(subStr); // uncomment if you want to see substrings
            }
        }
        System.out.println("No of palindromic substrings in the given string is: " + count);
    }
}
