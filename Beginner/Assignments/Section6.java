// 🟩 Section 7: Arrays
// Q17. Create an array of size 5. Input numbers and:

// Print all values

// Find the average

// Find the maximum and minimum

// Q18. Write a program to search for an element in an array (linear search).

// Q19. Write a program to sort an array in ascending order without using built-in methods (use selection sort or bubble sort).

package Beginner.Assignments;

import java.util.Scanner;

public class Section6 {

    public static void main(String[] args) {
        // arrayFunctions.arrayCreation();
        linearSearch();
    }

    public class arrayFunctions {
        static void arrayCreation() {
            int avg = 0;
            int maximum = Integer.MIN_VALUE;
            int minimum = Integer.MAX_VALUE;

            Scanner in = new Scanner(System.in);
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = in.nextInt();

            }
            in.close();
            for (int i : arr) {
                if (i > maximum) {
                    maximum = i;
                }

                if (i < minimum) {
                    minimum = i;
                }
                avg += i;
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.print("Average value is : " + avg / arr.length);
            System.out.println();
            System.out.print("Maximum value is : " + maximum);
            System.out.println();
            System.out.print("Minimum value is : " + minimum);

        }

    }

    static void linearSearch() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();

        }
        System.out.print("Enter the element to search: ");
        int input = in.nextInt();
        in.close();

        for (int i = 0; i < 5; i++) {
            if (arr[i] == input) {
                System.out.print("Element found at index: " + i);
                break;
            }

        }

    }

}