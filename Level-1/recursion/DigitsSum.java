import java.util.Scanner;

public class DigitsSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter val of n: ");
        int n = in.nextInt();
        in.close();

        sumRes(n);
        System.out.println(ans);

    }

    static int ans = 0;

    static void sumRes(int n) {
        if (n == 0)
            return;

        int temp = n % 10;
        ans += temp;
        sumRes(n / 10);
        // System.out.print(ans + " ");
    }

}