package org.example.module_5_collection_framework.list_interface.array_list.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList(Arrays.asList(4, 9, 1, 7, 9)); // array declaration with initialization

        // write logic to find the second largest number
        Integer firstLargest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;

        for(Integer ele: input) {
            if(ele > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = ele;
            } else if(ele < firstLargest && ele > secondLargest) {
                secondLargest = ele;
            }
        }

        // print the output, expected output = 7
        System.out.println(secondLargest);
    }
}
