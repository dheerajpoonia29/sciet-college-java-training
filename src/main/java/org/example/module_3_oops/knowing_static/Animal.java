package org.example.module_3_oops.knowing_static;

public class Animal {
    String color;
    Integer speed;

    static Integer legCount;

    public void printDetail() {
        System.out.println(color +" " + speed);
    }

    public static void myFunction() {
        System.out.println("static method");
    }
}
