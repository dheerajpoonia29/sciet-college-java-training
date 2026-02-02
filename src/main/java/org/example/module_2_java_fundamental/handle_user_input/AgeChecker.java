package org.example.module_2_java_fundamental.handle_user_input;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // nextLine function of InputStream class
        System.out.print("enter your name: ");
        String name = obj.nextLine();
        System.out.println("name = " + name);

        //nextInt is InputStream class function which take integer form of input from user
        System.out.print("enter your age: ");
        int age = obj.nextInt();
        System.out.println("age = " + age);

        System.out.print("enter your height: ");
        float height = obj.nextFloat();
        System.out.println("height = " + height);
    }
}
