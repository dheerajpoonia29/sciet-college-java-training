package org.example.module_5_collection_framework.set_interface.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 2, 4, 1, 5);
        printDuplicateElement(list);
    }

    public static void printDuplicateElement(List<Integer> list) {
        // write logic to print duplicate element from the list

        // total time complexity is n^2
//        for(int i=0; i<list.size(); i++) { // runing i=0 to n
//            for(int j=i+1; j<list.size(); j++) { // running j=i+1 to n
//                if(list.get(i).equals(list.get(j))) {
//                    System.out.print(list.get(i) + " ");
//                }
//            }
//        }

        // if you hashset here the time complexity reduced to n
        HashSet<Integer> st = new HashSet<>();

        for(Integer ele: list) { // running i=0 to n -> total complexity to O(n)
            if(st.contains(ele)) { // o(1)
                System.out.print(ele + " ");
            } else {
                st.add(ele);
            }
        }
    }
}
