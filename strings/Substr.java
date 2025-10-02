package strings;

import java.util.Scanner;

public class Substr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = in.nextLine();

        // printSubstr(str1);

        char[] myarr = str1.toCharArray();

        for (int i : myarr) {
            System.out.print(i);
        }
    }

    static void printSubstr(String s) {
        for (int i = 0; i < s.length(); i++) {
            String substring = "";
            for (int j = i; j < s.length(); j++) {
                substring += s.charAt(j);
                System.out.println(substring);
            }
            // System.out.println(substring);
        }
    }
}
