package Alpha;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int num = i;
            if (prime(num)) {
                System.out.println(i);
            }
        }

    }

    static boolean prime(int num) {
        if (num < 2) {
            return false;
        }

        if (num == 2 || num == 3) {
            return true;
        }

        for (int i = 2; i <= (num / 2) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}