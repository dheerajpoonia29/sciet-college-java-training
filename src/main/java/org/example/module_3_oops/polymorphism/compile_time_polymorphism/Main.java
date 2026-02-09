package org.example.module_3_oops.polymorphism.compile_time_polymorphism;

public class Main {
    public static void main(String[] args) {
        Fruit obj = new Fruit();

        // compile time polymorphism

        // calling getFruit method with no argument
        obj.getFruit();

        // calling getFruit method with 1 argument
        obj.getFruit("banana");

        // calling getFruit method with 2 argument
        obj.getFruit("banana", 5);
    }
}
