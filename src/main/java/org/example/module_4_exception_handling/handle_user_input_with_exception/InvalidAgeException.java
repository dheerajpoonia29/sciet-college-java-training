package org.example.module_4_exception_handling.handle_user_input_with_exception;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String msg) {
        super(msg);
    }
}
