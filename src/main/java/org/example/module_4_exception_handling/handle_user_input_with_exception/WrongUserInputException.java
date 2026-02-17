package org.example.module_4_exception_handling.handle_user_input_with_exception;

public class WrongUserInputException extends Exception {
    WrongUserInputException(String msg) {
        super(msg);
    }
}
