package org.example.module_3_oops.abstraction.with_interface;

public class Tv implements RemoteInterface {
    public void turnOn() {
        System.out.println("turning on tv remote");
    }

    public void turnOff() {
        System.out.println("turning off tv remote ");
    }
}
