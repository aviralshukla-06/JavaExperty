// 🔶 Section 6: Strings and Booleans
// Q14. Accept a name from the user and perform:

// Check if it contains the letter a

// Print its length and convert to uppercase

// Reverse the string manually (no built-in reverse)

// Q15. Compare two user-entered strings and check if they are equal (case-sensitive and insensitive)

// Q16. Write a boolean method isPalindrome(String s) that returns true if the string is a palindrome.

package Beginner.Assignments;

import java.util.Scanner;

public class Section5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        // System.out.print("Enter your nameA: ");
        // String nameA = in.nextLine();
        // System.out.print("Enter your nameB: ");
        // String nameB = in.nextLine();
        in.close();
        // containsA(name);
        // reverseName(name);
        // caseSensitivity(nameA, nameB);
        if (isPallindrome(name)) {
            System.out.println("Given string is pallindromic");
        }

        int ans = 11 / 2;
        System.out.println(ans);
    }

    static void containsA(String name) {

        name = name.toLowerCase();
        System.out
                .println("Given name toUpparCase is " + name.toUpperCase() + " and has length of : " + name.length());
        char[] nameArr = name.toCharArray();
        boolean found = false;
        for (int i = 0; i < nameArr.length; i++) {
            char c = name.charAt(i);
            if (c == 'a') {
                System.out.println("Yes at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {

            System.out.println("Given name does not contain \"a\"");
        }
    }

    static void reverseName(String name) {
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
            // System.out.println(reversed);
        }

        System.out.println(reversed);

    }

    static void caseSensitivity(String nameA, String nameB) {
        if (nameA.equals(nameB)) {
            System.out.println("This case follows case-sitivity");
        } else {
            System.out.println("Please correct the names");
        }

        if (nameA.equalsIgnoreCase(nameB)) {
            System.out.println("This case follows case-insitivity");
        } else {
            System.out.println("Please correct the names");
        }
    }

    static boolean isPallindrome(String name) {

        name = name.toLowerCase();
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                System.out.println("Give string is not pallindromic");
                return false;
            }
        }

        return true;
    }

}