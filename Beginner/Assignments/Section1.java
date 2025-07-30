// Problem Statement
// Q1. Write a Java program to print the following information using System.out.print():
// Your full name
// Your branch of study
// Current year in college
// Q2. Add both single-line and multi-line comments in the above program to explain what each line is doing.

package Beginner.Assignments;

import java.util.Scanner;

public class Section1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your Branch of Study: ");
        String branch = in.nextLine();
        System.out.print("Enter your College Name: ");
        String college = in.nextLine();
        System.out.print("Enter your current-year: ");
        String year = in.nextLine();
        in.close();

        /*
         * this following Section
         * is dedicated to
         * print the overall student biodata
         */

        System.out.println("Student biodata: ");
        System.out.println("Student name : " + name);
        System.out.println("Student branch of study: " + branch);
        System.out.println("Student college name : " + college);
        System.out.println("Year of academic study : " + year);
    }

}