package org.example.module_2_java_fundamental.control_flow.decision_statement;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int day = obj.nextInt();

        System.out.print("Day name is: ");
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("day no is invalid");
        }

    }
}
