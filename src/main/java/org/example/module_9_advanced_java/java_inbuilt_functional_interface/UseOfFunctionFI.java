package org.example.module_9_advanced_java.java_inbuilt_functional_interface;

import java.util.function.Function;

public class UseOfFunctionFI {
    public static void main(String[] args) {
        Function<String, Integer> stringLengthChecker = (str) -> {
            System.out.println("checking length for str: " + str);
            return str.length();
        };

        System.out.println(stringLengthChecker.apply("ram")); // 3
        System.out.println(stringLengthChecker.apply("chandler")); // 8
    }
}
