package org.example.module_5_collection_framework.list_interface.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList(Arrays.asList(10, 5, 20, 15, 30));

        System.out.println("before sorting");
        displayArray(arr);

        // way 1 of sorting using Collections class
//        Collections.sort(arr);

        // way 2 of sorting using sort method of ArrayList class
        // sort in default natural order (ascending order)
//        arr.sort(null);
        // sort in descending order
        arr.sort(Collections.reverseOrder());

        System.out.println("after sorting");
        displayArray(arr);

    }

    private static void displayArray(ArrayList<Integer> arr) {
        for(Integer ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
