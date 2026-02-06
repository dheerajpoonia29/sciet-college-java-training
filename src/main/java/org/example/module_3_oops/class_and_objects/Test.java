package org.example.module_3_oops.class_and_objects;

public class Test {
    public static void main(String[] args) {
        // dog is an object (real world) created by Animal class (blue print of object)
        Animal dog = new Animal();
        dog.colour = "black";
        dog.speed = 15;

        dog.workType();
        dog.sound("bark"); // value bark is function argument

        Animal cow = new Animal("white", 2);

    }
}
