package org.example.module_5_collection_framework.generic_programming;

import java.util.ArrayList;

public class Example2GenericMethodWithCollectionFramework {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("iterating integer ArrayList:");
        iterateArrayList(intList);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Hi");
        System.out.println("iterating string ArrayList:");
        iterateArrayList(stringList);

        ArrayList<Float> floatList = new ArrayList<>();
        floatList.add(10.5f);
        floatList.add(20.5f);
        floatList.add(30.5f);
        System.out.println("iterating float ArrayList:");
        iterateArrayList(floatList);
    }

    // create a function which iterate ArrayList of any type
    public static <T> void iterateArrayList(ArrayList<T> list) {
        for(T element: list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
