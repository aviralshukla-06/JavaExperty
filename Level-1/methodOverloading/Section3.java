// Write a program with a method multiply() overloaded for:
// Two integers.
// Two floats.
// One integer and one float.

public class Section3 {
    public static void main(String[] args) {

        int ans1 = multiply(5, 7);
        System.out.println(ans1);

        float ans2 = multiply(34.32f, 28.74f);
        System.out.println(ans2);

        float ans3 = multiply(43, 65.64f);
        System.out.println(ans3);

    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static float multiply(float a, float b) {
        return a * b;
    }

    static float multiply(int a, float b) {
        return a * b;
    }

}