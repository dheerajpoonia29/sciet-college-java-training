package org.example.module_3_oops.encapsulation.data_hiding;

public class ClassInSamePackage {
    public static void main(String[] args) {
        Person obj = new Person();

        // variable with public access modifier is used in different
        obj.age = 10;

        // we can access variable with protected modifier in same package different class
        obj.name = "joe";

        // we can not access variable with default modifier in same package different class
        // obj.height = 5.5;

        // we can not access variable with private modifier in same package different class
        // obj.city = "delhi";
    }
}
