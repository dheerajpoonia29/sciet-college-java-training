package org.example.module_4_exception_handling.handling_runtime_error;

public class Example4_Thows {
    public static void main(String[] args) {
        System.out.println("creating object of Example3_Throw class");
        Example4_Thows obj = new Example4_Thows();
        System.out.println("start of program, calling take input method");
        // handle the exception here
        try {
            obj.takeInput();
        } catch(ArithmeticException e) {
            System.out.println("handling the excpetion outside of function which is causing runtime error");
        }

        System.out.println("end of program");
    }

    public void takeInput() throws ArithmeticException {
        // we handle exception in this method itself
//        try {
//            int a = 10/0;
//        } catch(ArithmeticException e) {
//
//        }
        int a = 10/0; // runtime error
    }
}
