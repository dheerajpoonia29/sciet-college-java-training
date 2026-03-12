package org.example.module_9_advanced_java.java_inbuilt_functional_interface;

import java.util.function.Consumer;

public class UseOfConsumerFI {
    public static void main(String[] args) {
        Consumer<Float> obj = (a) -> {
            System.out.println("got value = " + a);
        };

        obj.accept(20.5f);
    }
}
