// 🟡 Section 2: Variables, Data Types, and Type Casting
// Q3. Declare variables of type int, double, boolean, and char. Initialize them and print their values.

// Q4. Take two numbers of different data types (int and double), perform all arithmetic operations, and demonstrate:

// Implicit casting

// Explicit casting (double to int)

// Q5. Create a program that calculates the area and perimeter of a rectangle. Input: length and width as double.

package Beginner.Assignments;

public class Section2 {

    public static void main(String[] args) {
        int a = 5;
        boolean isTrue = false;
        char c = 'a';
        double num = 11.5;

        int length = 55;
        double width = 20.22;

        int sum = a + (int) num;
        System.out.println(sum);

        double sumANs = num + a;
        System.out.println(sumANs);
        areaCal(length, width);
        periCal(length, width);
    }

    static void areaCal(int length, double width) {
        double area = length * width;
        System.out.println(area);

    }

    static void periCal(int length, double width) {
        double perimeter = 2 * (length + width);
        System.out.println(perimeter);

    }
}