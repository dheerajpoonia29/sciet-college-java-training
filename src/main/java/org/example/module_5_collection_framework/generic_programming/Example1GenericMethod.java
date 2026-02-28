package org.example.module_5_collection_framework.generic_programming;

public class Example1GenericMethod {
    public static void main(String[] args) {
        Example1GenericMethod obj = new Example1GenericMethod();

        obj.display1(10); // 10
        obj.display1(10.5f); // 10.5
        obj.display1("Hello World"); // Hello World
        obj.display1(true); // true
        obj.display1(100L); // 100


        obj.display2(10, "Hello"); // 10 Hello
        obj.display2(10.5f, true); // 10.5 true
        obj.display2("hello", "world");

        System.out.println(obj.display3(10, "Hello World")); // Hello World
        System.out.println(obj.display3(10.5f, true)); // true
    }

    // function signature = access modifier + <generic type> + return type + function name + parameters list
    // display is generic function which can accept any type of data and print it to the console.
    public <T> void display1(T data) {
        System.out.println(data);
    }

    public <T1, T2, T3, T4, T5> void display2(T1 data1, T2 data2) {
        System.out.println(data1 + " " + data2);
    }

    public <T1, T2> T2 display3(T1 data1, T2 data2) {
        return data2;
    }
}
