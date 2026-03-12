package org.example.module_9_advanced_java.lambda_expression.example_2;

public class Main {
    public static void main(String[] args) {
        Greeting<String> ob1 = (String a) -> {
            System.out.println("argument = : "+a);
        };

        ob1.greet("hello world");
        ob1.greet("ram");

        Greeting<Integer> ob2 = (Integer a) -> {
            System.out.println("argument = : "+a);
        };
        ob2.greet(10);
        ob2.greet(100);
    }
}
