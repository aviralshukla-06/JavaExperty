// Q6. Write a calculator program that performs:

// Addition, subtraction, multiplication, division, and modulus
// Q7. Accept age as input and determine:

// If age < 18 → print "Minor"

// If age >= 18 and < 60 → print "Adult"

// If age >= 60 → print "Senior Citizen"

// Q9. Accept three numbers from the user and print the maximum and minimum using nested if statements.

package Beginner.Assignments;

import java.util.Scanner;

public class Section3 {

    public static void main(String[] args) {
        int a = 5;
        int b = 45;
        int c = 34;
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = in.nextInt();
        // System.out.println("Enter your choice: ");
        // String choice = in.nextLine();
        // in.close();

        // age(age);

        // calci(choice, a, b);

        minMax(a, b, a);

    }

    static void calci(String choice, int a, int b) {

        switch (choice) {
            case "add":
                int result = a + b;
                System.out.println(result);
                break;
            case "subtract":
                int subresult = a - b;
                System.out.println(subresult);
                break;
            case "multiply":
                int mulresult = a * b;
                System.out.println(mulresult);
                break;
            case "divide":
                int divresult = a / b;
                System.out.println(divresult);
                break;
            case "mod":
                int modresult = a % b;
                System.out.println(modresult);
                break;

            default:
                System.out.println("Please provide proper option");
                break;
        }
    }

    static void age(int age) {
        String category = (age < 18 ? "Minor" : age > 18 && age < 60 ? "Adult" : "Senior Citizen");
        System.out.println(category);
    }

    static void minMax(int a, int b, int age) {
        if (a == b) {
            System.out.println("Enter unequal values");
        } else if (a > b) {
            if (b > age) {
                System.out.println(a);
            } else if (age > a) {
                System.out.println(age);
            } else {
                System.out.println(b);
            }
        }

        if (a < b) {
            if (b < age) {
                System.out.println(a);
            } else if (b > age) {
                System.out.println(age);
            } else {
                System.out.println(b);
            }
        }
    }

}