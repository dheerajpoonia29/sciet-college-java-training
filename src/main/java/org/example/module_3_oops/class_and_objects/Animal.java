package org.example.module_3_oops.class_and_objects;

public class Animal {
    // attribute (variables)
    public String colour;
    public Integer speed;

    // constructor with no parameter
    Animal() {
        System.out.println("constructor with no argument called");
    }

    // constructor with 1 parameter
    Animal(String value1, int value2) {
        System.out.println("constrctor with 2 argument called");
        colour = value1;
        speed = value2;
    }

    // behaviour (methods or functions)
    public String workType() {
        return "1";
    }

    public void sound(String sd) { // sd is function parameter
        System.out.println(sd);
    }
}
