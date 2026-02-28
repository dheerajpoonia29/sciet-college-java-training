package org.example.module_5_collection_framework.map_interface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearningTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // store in pair by keeping sorted order of key
        map.put(2, "Two");
        map.put(4, "Four");
        map.put(1, "One");
        map.put(3, "Three");

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
