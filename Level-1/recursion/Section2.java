public class Section2 {
    public static void main(String[] args) {
        // int ans1 = dgtCtr(123);
        // System.out.println(ans1);

        int ans = zeroCounter(00000);
        System.out.println(ans);

    }

    static int dgtCtr(int n) {
        if (n / 10 == 0) {
            return n;
        }
        int dgt = n % 10;
        return dgt + dgtCtr(n / 10);
    }

    static int zeros = 0;

    static int zeroCounter(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 1;
        }
        int dgt = n % 10;
        if (dgt == 0)
            zeros++;
        zeroCounter(n / 10);
        return zeros;

    }
}