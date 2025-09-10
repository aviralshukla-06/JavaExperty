import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter val of n: ");
        int n = in.nextInt();
        in.close();

        // Fibonacci myFib = new Fibonacci();
        // myFib.fibbo(0, 1, n);

        Fibonacci myFact = new Fibonacci();
        int ans = myFact.factorial(n);
        System.out.println(ans);
    }

    public void fibbo(int a, int b, int n) {
        if (n == 0)
            return;

        System.out.println(a + " ");
        fibbo(b, a + b, n - 1);

        // System.out.println(c);
    }

    public int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);

    }
}