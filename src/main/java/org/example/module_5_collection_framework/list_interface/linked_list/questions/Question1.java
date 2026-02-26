package org.example.module_5_collection_framework.list_interface.linked_list.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Question1 {
    public static void main(String[] args) {
        LinkedList<Integer> input = new LinkedList(Arrays.asList(1, 2, 1, 3, 2));

        // write logic to remove duplicates elements from input
        LinkedList<Integer> output = new LinkedList(); // output [10, 20, 30, 40]
        // you need to write logic to remove duplicates elements from input
        for(Integer ele: input) {
            if(output.contains(ele)==false) {
                output.add(ele);
            }
        }

        // 1, 2, 3
        for(Integer ele: output) {
            System.out.print(ele + " ");
        }
    }
}
