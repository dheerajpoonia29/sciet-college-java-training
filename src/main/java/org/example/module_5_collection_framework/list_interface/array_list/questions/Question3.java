package org.example.module_5_collection_framework.list_interface.array_list.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList(Arrays.asList("java", "spring", "sql"));

        // write logic to rever input without using any in built class
//        Collections.sort(input, Collections.reverseOrder());
//        input.sort(Collections.reverseOrder());


        ArrayList<String> output = new ArrayList();
        for(int i=input.size()-1; i>=0; i--) {
            output.add(input.get(i));
        }

//        int i = input.size()-1;
//        while(i>=0) {
//            i--;
//        }

        // print the reverse of input
        for(String ele: output) {
            System.out.print(ele + " ");
        }
    }
}
