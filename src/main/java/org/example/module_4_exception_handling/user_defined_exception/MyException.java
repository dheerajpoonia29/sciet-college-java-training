package org.example.module_4_exception_handling.user_defined_exception;

public class MyException extends Exception {
    MyException(String msg) {
        super(msg); // with super function parent class constructor called:  public Exception(String message) { super(message); }
    }
}
