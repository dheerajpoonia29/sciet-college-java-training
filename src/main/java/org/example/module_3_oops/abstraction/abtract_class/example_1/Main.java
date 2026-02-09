package org.example.module_3_oops.abstraction.abtract_class.example_1;

public class Main {
    public static void main(String[] args) {
        // we can not create object of abstract class
//        Person obj = new Person();
//        obj.printDetail();

        Teacher t1 = new Teacher();
        t1.printDetail();
        t1.setDetail();
    }
}
