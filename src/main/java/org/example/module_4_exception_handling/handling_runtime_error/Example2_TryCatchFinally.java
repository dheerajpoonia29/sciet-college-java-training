package org.example.module_4_exception_handling.handling_runtime_error;

public class Example2_TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("start statement");

        // handled the exception using try-catch block
        try {
            int a = 10/2; // we got arithmetic exception
        } catch(ArithmeticException e) {
            System.out.println("handled arithmetic exception");
        } finally {
            System.out.println("this block always got called weather we got exception or not");
        }

        System.out.println("end statement");
    }
}
