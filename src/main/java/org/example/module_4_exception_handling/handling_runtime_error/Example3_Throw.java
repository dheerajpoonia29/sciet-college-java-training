package org.example.module_4_exception_handling.handling_runtime_error;

import java.util.Scanner;

public class Example3_Throw {
    public static void main(String[] args) {
        System.out.println("creating object of Example3_Throw class");
        Example3_Throw obj = new Example3_Throw();
        System.out.println("start of program, calling take input method");
        obj.takeInput();
        System.out.println("calling print input method");
        obj.printInput();
        System.out.println("end of program");
    }

    public void takeInput() {
        // explicitly throwing an exception
        // throw is a keyword using that program can throw exception
        Scanner obj = new Scanner(System.in);

        System.out.println("enter age (1-18): ");
        int age = obj.nextInt(); // program break here due to wrong input type

        if(age > 18) {
            System.out.println("user enter invalid age throwing exception");
            // throw used to throw exception explicitly
            throw new IllegalArgumentException();
        }

        System.out.println("user enter valid age = " + age);
    }

    public void printInput() {

    }
}
