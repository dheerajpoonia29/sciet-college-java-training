package org.example.module_9_advanced_java.example_1;

public class Main {
    public static void main(String[] args) {
        // lambda function or lamba expression
        MathOperation add = (a, b) -> {
            System.out.print("adding a+b: ");
            return a+b;
        };
        System.out.println(add.operation(10, 20));
        System.out.println(add.operation(100, 200));

        MathOperation sub = (a, b) -> {
            System.out.println("subtracting a-b: ");
            return a-b;
        };
        System.out.println(sub.operation(100, 200)); // -100
        System.out.println(sub.operation(10, 5)); // 5

        // lambda expression for multiplication & division
        MathOperation div = (a, b) -> {
            System.out.println("dividing a/b: ");
            return a/b;
        };

        MathOperation mul = (a, b) -> {
            System.out.println("multipying a/b: ");
            return a*b;
        };
    }

    // simple function with name (operation) and parameter list (a, b)
    public int operation(int a, int b) {
        System.out.println("adding two value");
        return a+b;
    }
}
