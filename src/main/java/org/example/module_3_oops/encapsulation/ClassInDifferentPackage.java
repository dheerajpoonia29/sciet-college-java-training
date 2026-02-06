package org.example.module_3_oops.encapsulation;

import org.example.module_3_oops.encapsulation.data_hiding.Person;

public class ClassInDifferentPackage {
    public static void main(String[] args) {
        Person obj = new Person();

        // variable with public access modifier is called in different package
        obj.age = 20;

        // we can not access variable with protected modifier in different package different class
        // obj.name = "joe";

        // we can not access variable with default modifier in different package different class
        //obj.height = 5.5;

        // we can not access variable with private modifier in same package different class
        // obj.city = "delhi";
    }
}
