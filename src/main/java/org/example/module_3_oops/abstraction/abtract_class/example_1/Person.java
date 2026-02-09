package org.example.module_3_oops.abstraction.abtract_class.example_1;

// abstract class
public abstract class Person {
    public void printDetail() {
        // simple function or non abstract function with implementation
        System.out.println("print detail of person");
    }

    // abstract function, abstract function will never contain implementation
    public abstract void setDetail(); // abstract function with no implementation
}
