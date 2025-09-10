public class Section1 {

    public static void main(String[] args) {
        // printNum(1);
        // int ans = printFactorial(10);
        int ans1 = fibonacci(10);
        System.out.println(ans1);

    }

    static void printNum(int n) {
        // if (n <= 10) {
        // System.out.println(n);
        // printNum(n + 1);
        // } else {
        // return;
        // }

        if (n > 10)
            return;
        System.out.println(n);
        printNum(n + 1);

    }

    static int printFactorial(int n) {

        if (n == 0)
            return 1;
        return n * printFactorial(n - 1);

    }

    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int ans = fibonacci(n - 1) + fibonacci(n - 2);
        System.out.print(ans + "  ");
        return ans;

    }

}