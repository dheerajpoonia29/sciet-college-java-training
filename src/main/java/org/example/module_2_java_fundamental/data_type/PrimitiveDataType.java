package org.example.module_2_java_fundamental.data_type;

public class PrimitiveDataType {
    public static void main(String[] args) {
        // Integer type of primitive data
        byte byteVar = -128;
        byte byteVar2 = 'a'; // 1 byte of memory
        short shortVar = 100; // 2 bytes of memory
        int intVar = 1000; // 4 bytes of memory
        long longVar = 1000000; // 8 bytes of memory

        // Float type of primitive data
        float floatVar = 10.5f;
        double doubleVar = 10.9999999999;

        char charVar = 'a';

        boolean booleanVar = true;
        boolean booleanVar1 = false;

        System.out.println("byteVar: " + byteVar);
        System.out.print("intVar: " + intVar);
        System.out.print(" floatVar: " + floatVar);
    }
}
