package org.example.module_5_collection_framework.generic_programming.questions;

public class Question1 {
    public static void main(String[] args) {
        Question1 obj = new Question1();
        obj.printValue(10);
        obj.printValue("Hello World");
    }

    // write generic method printValue(T value)
    public <T> void printValue(T value) {
        System.out.println(value);
    }

    public <T> T getValue(T value) {
        return value;
    }
}
