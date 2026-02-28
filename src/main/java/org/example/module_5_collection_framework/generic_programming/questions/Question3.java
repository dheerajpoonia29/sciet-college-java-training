package org.example.module_5_collection_framework.generic_programming.questions;

public class Question3 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setVar(10);
        System.out.println(intBox.getVar());

        Box<String> strBox = new Box<>();
        strBox.setVar("Hello World");
        System.out.println(strBox.getVar());
    }
}

class Box<T> {
    private T var; // global private variable

    public void setVar(T myVar) {
        this.var = myVar;
    }

    public T getVar() {
        return var;
    }
}
