package org.example.module_5_collection_framework.map_interface.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 2, 3, 1, 4);
        countFrequency(input);
    }

    public static void countFrequency(List<Integer> input) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();

        /*
        Map {
        1: 2,
        2: 2,
        3: 1,
        4: 1
        }

         */

        for(Integer num : input) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue()+" ");
        }
    }
}
