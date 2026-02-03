package org.example.module_2_java_fundamental.control_flow.decision_statement;

public class IfElseExample {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        String result = "";

        if (a>b) {
            result = "a is greater then b";
        } else if(a==b) {
            result = "a is equal to b";
        }
        else {
            result = "b is greater then a";
        }

        System.out.println(result);
    }
}
