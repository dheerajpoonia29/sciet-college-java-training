package org.example.module_5_collection_framework.map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearningLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // store in pair by keeping there insertion order
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
