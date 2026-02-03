package org.example.module_2_java_fundamental;

import java.util.Scanner;

public class CalculatorAssignment {
    public static void main(String[] args) {
        System.out.println("Select your operator");
        System.out.println("1. addition");
        System.out.println("2. substraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");

        Scanner obj = new Scanner(System.in);

        boolean wantToContinue = true;
        do {
            System.out.print("Choose your option (1-4):");
            int option = obj.nextInt();

            System.out.print("Enter first no: ");
            int a = obj.nextInt();
            System.out.print("Enter second no:");
            int b = obj.nextInt();

            int result = 0;
            switch(option) {
                case 1:
                    result = a+b;
                    break;
                case 2:
                    result = a-b;
                    break;
                case 3:
                    result = a*b;
                    break;
                case 4:
                    result = a/b;
                default:
                    System.out.println("option invalid");
            }

            System.out.println("result = " + result);
            System.out.println("want to continue (true/false) ? ");
            wantToContinue = obj.nextBoolean();
        } while (wantToContinue == true);

    }
}

/*
Select your operator
1. addition
2. substraction
3. multiplication
4. division
Choose your option (1-4):
Enter first no:
Enter second no:
Result =
 */
