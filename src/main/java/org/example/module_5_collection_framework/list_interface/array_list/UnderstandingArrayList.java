package org.example.module_5_collection_framework.list_interface.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();

        arr.add(10);
        arr.add(1, 20);

        System.out.println(arr.get(1));
        arr.set(1, 30);

        arr.remove(0);

        System.out.println(arr.size());

        System.out.println(arr.contains(30));
        System.out.println(arr.contains(20));
    }

    public static void arrayVsArrayList() {
        int[] arr1 = new int[3]; // declaration of array

        // initialization of array
        arr1[0] = 10;
        arr1[1] = 20;
//        arr[2] = null; not supported


        ArrayList<Integer> arr2 = new ArrayList(); // declaration of array using ArrayList
        arr2.add(10); // initialization of array
        arr2.add(null);


        int[] arr3 = {10, 20, 30}; // declaration with initialization of array
//        arr3[4] = 100;
        ArrayList<Integer> arr4 = (ArrayList<Integer>) Arrays.asList(10, 20, 30); // declaration with initialization of array using ArrayList
        arr4.add(100);
    }
}
