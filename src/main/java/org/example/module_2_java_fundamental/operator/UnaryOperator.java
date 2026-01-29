package org.example.module_2_java_fundamental.operator;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("-a: " + -a);
        System.out.println("+a: " + +a);
        System.out.println("++a: " + ++a); // a+1  (pre increment unary operator) it first add 1 to value then it cnosume value
        System.out.println("a++: " + a++); // a, a+1 (post increment unary opeartor) it first consume the value then add 1 to value
        System.out.println("a: " + a); // 12
        System.out.println("--a: " + --a); // a-1 (pre decrement unary opeartor)
        System.out.println("a--: " + a--); // a, a-1 (post decrement unary opeartor)
        System.out.println("a: " + a);
    }
}
