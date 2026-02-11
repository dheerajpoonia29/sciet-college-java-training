package org.example.module_3_oops.abstraction.with_abstract_class.example_2;

public class Main {
    public static void main(String[] args) {
        RemoteAbstractClass acObj = new Ac();
        acObj.turnOn();

        RemoteAbstractClass tvObj = new Tv();
        tvObj.turnOn();

        acObj.turnOff();
        tvObj.turnOff();
    }
}
