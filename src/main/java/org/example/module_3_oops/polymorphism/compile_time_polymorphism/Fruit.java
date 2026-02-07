package org.example.module_3_oops.polymorphism.compile_time_polymorphism;

public class Fruit {

    // getFruit method overloaded by three different type

    // method with no parameter defined
    public void getFruit() {
        System.out.println("called get fruit method");
    }

    // method with 1 parameter defined
    public void getFruit(String name) {
        System.out.println("called get fruit method with 1 argument");
    }

    // method with 2 parameter defined
    public void getFruit(String name, Integer count) {
        System.out.println("called get fruit method with 2 argument");
    }
}
