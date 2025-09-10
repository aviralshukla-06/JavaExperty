
// 🔹 Section 1: Method Overloading – Basics
// Create a method add that adds two integers. Overload it to:
// Add two double values.
// Add three integers.
// Add a string and an integer (concatenation).

public class Section1 {
    public static void main(String[] args) {

        int ans1 = addFunction(5, 7);
        System.out.println(ans1);

        double ans2 = addFunction(34.32, 28.74);
        System.out.println(ans2);

        int ans3 = addFunction(43, ans1, 65);
        System.out.println(ans3);

        addFunction(ans3, "Aviral");
    }

    static int addFunction(int a, int b) {
        return a + b;
    }

    static double addFunction(double a, double b) {
        return a + b;
    }

    static int addFunction(int a, int b, int c) {
        return a + b + c;
    }

    static void addFunction(int a, String str) {
        System.out.println(a + str);
    }
}