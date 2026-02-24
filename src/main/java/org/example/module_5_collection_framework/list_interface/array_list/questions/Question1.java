package org.example.module_5_collection_framework.list_interface.array_list.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList(Arrays.asList(10, 20, 10, 30, 20));

        // you need to write logic to remove duplicates elements from input


        for(Integer ele: input) {
            System.out.print(ele + " ");
        }
    }
}
