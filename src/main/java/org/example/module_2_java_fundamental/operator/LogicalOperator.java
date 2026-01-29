package org.example.module_2_java_fundamental.operator;

public class LogicalOperator {
    public static void main(String[] args) {

        // AND (&&) logical operator return true if both values are true
        System.out.println("AND (&&) logical operator");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // false

        // OR (||) logical operator which return true if one of the values is true
        System.out.println("OR (||) logical operator");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // NOT (!) logical operator which reverse the value
        System.out.println("NOT (!) logical operator");
        System.out.println(!true); // false
        System.out.println(!false); // true

        System.out.println("We can use logical operator with relational operator");
        int a = 10;
        int b = 20;

        System.out.println("(a>b) && (a==b): " + ((a>b) && (a==b))); // false
        // a>b -> false
        // a==b -> false
        // false && false -> false

        int c = 10;
        System.out.println("!(a>b) && (a==c): " + (!(a>b) && (a==c))); // true
        // a>b -> false -> !false -> true
        // a==c -> 10 == 10 -> true

    }
}
