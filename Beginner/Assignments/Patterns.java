package Beginner.Assignments;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter val of n: ");
        int n = sc.nextInt();
        sc.close();

        // Patterns pat1 = new Patterns();
        // pat1.pattern3(n);
        evenOdd(n);

    }

    public void pattern1(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j <= n; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void evenOdd(int num) {
        int ans = num & 1;
        System.out.println(ans);
        if (ans == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

}