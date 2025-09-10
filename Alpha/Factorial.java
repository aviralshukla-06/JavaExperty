package Alpha;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        // int ans = 1;
        // for (int i = n; i > 0; i--) {
        // ans *= i;
        // }
        // System.out.println(ans);
        // int val = facto(n);
        // System.out.println(val);
        fibbo(8);

    }

    static int facto(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * facto(n - 1);
    }

    static void fibbo(int n) {
        int a = 0;
        int b = 1;
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}