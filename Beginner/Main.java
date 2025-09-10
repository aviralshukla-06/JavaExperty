package Beginner;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        String str = "hello there what are you doing?";
        String str1 = "Are you fine?";

        System.out.println(str.length());
        char[] myarr = str.toCharArray();
        for (char c : myarr) {
            if (c == ' ') {
                System.out.print(c);
            } else {
                System.out.print(c + " ");
            }
        }
        System.out.println();

        int random = (int) (Math.random() * 24);
        System.out.println(random);

        // System.out.println(str.toCharArray());
        System.out.println(str.toUpperCase());
        System.out.println(str + " " + str1);
        System.out.println(str.concat(" " + str1));
    }

}
