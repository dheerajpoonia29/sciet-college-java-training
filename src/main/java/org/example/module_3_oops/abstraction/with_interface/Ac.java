package org.example.module_3_oops.abstraction.with_interface;

public class Ac implements RemoteInterface {
    public void turnOn() {
        System.out.println("ac turned on");
    }

    public void turnOff() {
        System.out.println("ac turned off");
    }
}
