package org.example.module_3_oops.abstraction.with_interface;

public class Main {
    public static void main(String[] args) {
        RemoteInterface acObj = new Ac();
        acObj.turnOn();

        RemoteInterface tvObj = new Tv();
        tvObj.turnOn();

        acObj.turnOff();
        tvObj.turnOff();
    }
}
