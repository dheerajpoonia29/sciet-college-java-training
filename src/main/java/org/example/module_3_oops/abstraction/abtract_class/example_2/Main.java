package org.example.module_3_oops.abstraction.abtract_class.example_2;

public class Main {
    public static void main(String[] args) {
        Remote acObj = new Ac();
        acObj.turnOn();

        Remote tvObj = new Tv();
        tvObj.turnOn();

        acObj.turnOff();
        tvObj.turnOff();
    }
}
