// Create a Calculator class and overload the calculate() method to perform:
// Addition of two numbers.
// Subtraction of three numbers.
// Multiplication of an array of numbers.

public class Calculator {

    public void calculate(int a, int b) {
        System.out.println(a + b);
    }

    public void calculate(int a, int b, int c) {
        System.out.println(a - b - c);
    }

    public void calculate(int[] arr) {
        int ans = 1;
        for (int i : arr) {
            ans *= i;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();
        Calculator obj3 = new Calculator();
        obj1.calculate(4, 7);
        obj2.calculate(34, 6, 8);
        obj3.calculate(new int[] { 3, 5, 6, 7, 8 });
    }
}
