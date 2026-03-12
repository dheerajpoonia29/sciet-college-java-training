package org.example.module_9_advanced_java.java_inbuilt_functional_interface;

import java.util.function.Supplier;

public class UseOfSupplierFI {
    public static void main(String[] args) {
        Supplier<Integer> obj = () -> {
            System.out.println("supplier integer value");
            return 10;
        };

        System.out.println(obj.get());
    }
}
