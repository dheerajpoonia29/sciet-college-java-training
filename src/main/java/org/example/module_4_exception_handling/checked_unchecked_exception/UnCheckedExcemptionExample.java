package org.example.module_4_exception_handling.checked_unchecked_exception;

public class UnCheckedExcemptionExample {
    public static void main(String[] args) {

        // unchecked exception are not checked at compile time it's our choice to do exception handling or not
        // it not necessary to handle unchecked exception
        int a = 10/0; // this will thorw unchecked exception which is ArithmeticException

        String b = null;
        System.out.println(b.length()); // thow NullPointerException which is unchecked exception
    }
}
