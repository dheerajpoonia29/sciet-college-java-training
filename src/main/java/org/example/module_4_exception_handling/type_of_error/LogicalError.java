package org.example.module_4_exception_handling.type_of_error;

public class LogicalError {
    public static void main(String[] args) {
        // logical error
        // program will compile, run and *never terminate* but gives wrong output
        // logical error can be resolved using unit testing where we compare expected vs actual outcome

        int a = 20;
        int b = 40;

        System.out.println(a-b);
    }
}
