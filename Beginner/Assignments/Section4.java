// 🟣 Section 5: Loops and Loop Control
// Q10. Use a for loop to print the multiplication table of a number entered by the user (e.g., 5 × 1 = 5 ... 5 × 10 = 50).

// Q11. Use a while loop to calculate the sum of even numbers from 1 to 100.

// Q12. Use a do-while loop to display a simple menu until the user enters "exit".

// Q13. Use break and continue to:

// Break the loop if number = 13

// Skip printing numbers divisible by 3

package Beginner.Assignments;

import java.util.Scanner;

public class Section4 {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter the number to diplay table: ");
        // int num = in.nextInt();
        // table(num);
        // evenSum(num);
        // breAndCon();
        DoWhile();
    }

    static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * num);
        }
    }

    static void evenSum(int num) {
        int ans = 0;
        while (num <= 100) {
            if (num % 2 == 0) {
                ans += num;
            }
            num++;
        }
        System.out.println(ans);
    }

    static void breAndCon() {
        for (int i = 1; i < 100; i++) {
            if (i == 13) {
                break;
            } else if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }

    static void DoWhile() {
        String menu;
        do {
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextLine();
            System.out.println("You entered: " + menu);
        } while (!menu.equals("exit"));
    }
}