package Beginner;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        sc.close();

        switch (name) {
            case "avi":
                System.out.println("You are my master");
                break;

            case "Utkarsh":
                System.out.println("You are my small master");
                break;

            case "laob":
                System.out.println("You are mac");
                break;

            default:
                System.out.println("so ja bhai , gand maar duga");
        }
    }
}
