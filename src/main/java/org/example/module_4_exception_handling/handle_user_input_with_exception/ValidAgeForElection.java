package org.example.module_4_exception_handling.handle_user_input_with_exception;

import java.util.Scanner;

public class ValidAgeForElection {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Boolean wantToExit = false;

        do {
            try {
                isValid();
            } catch(Exception e) {
                System.out.println("exception msg: " + e.getMessage());
            }
            System.out.println("want to exit (true/false): ");
            wantToExit = obj.nextBoolean();
        } while(wantToExit == false);
    }

    public static void isValid() throws WrongUserInputException, InvalidAgeException {
        Scanner obj = new Scanner(System.in);
        int age;
        try {
            System.out.println("enter age: ");
            age = obj.nextInt();
        } catch(Exception e) {
            throw new WrongUserInputException("wrong input type");
        }

        if(age>18) {
            System.out.println("age is valid for election");
        } else {
            throw new InvalidAgeException("invalid age");
        }
    }
}
