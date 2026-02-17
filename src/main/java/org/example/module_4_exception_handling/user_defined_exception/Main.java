package org.example.module_4_exception_handling.user_defined_exception;

public class Main {
    public static void main(String[] args) {
        try {
            isValidAgeToVote(16);
        } catch(Exception e) {
            System.out.println("got exception");
        }
    }

    public static void isValidAgeToVote(int age) throws MyException {
        if(age<18) {
            throw new MyException("age is invalid");
        } else {
            System.out.println("age is valid");
        }
    }
}
