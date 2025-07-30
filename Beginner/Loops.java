package Beginner;

public class Loops {

    public static void main(String[] args) {
        int i = 10;

        // WhileCounter(i);
        // DoCounter(i);
        ForCounter(i);
    }

    static void WhileCounter(int i) {
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }

    static void DoCounter(int i) {
        do {
            System.out.println("First Iteration");
            i--;
        } while (i > 1);
    }

    static void ForCounter(int i) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int total = 0;
        for (int k : arr) {
            total += k;
        }
        float avg = (float) total / (arr.length - 1);
        System.out.println(avg);
    }
}