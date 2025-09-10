import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter val of a: ");
        int a = in.nextInt();
        System.out.print("Enter val of b: ");
        int b = in.nextInt();
        in.close();

        int result = gcdCalculator(a, b);
        System.out.println(result);

    }

    static int gcdCalculator(int a, int b) {
        if (b == 0)
            return a;

        int ans = gcdCalculator(b, a % b);
        return ans;
    }
}

/*
 * (24, 33)
 * b != 0
 * (33,33%24 = 9)
 * b!=0
 * (9, 33%9 = 6)
 * b!=0
 * (6,9%6=3)
 * b!=0
 * (3, 6%3=0)
 * b=0 -> a = 3
 * 
 */