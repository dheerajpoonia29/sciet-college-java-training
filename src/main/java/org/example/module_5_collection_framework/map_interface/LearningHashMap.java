package org.example.module_5_collection_framework.map_interface;

import java.util.*;

public class LearningHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // adding key-value pairs to the map
        map.put(1, "ram");
        map.put(2, "shyam");
        map.put(3, "abhinav");
        map.putIfAbsent(1, "sita"); // will not update the value for key 1 since it already exists

        System.out.println(map.get(1)); // ram
        System.out.println(map.getOrDefault(10, "null"));

        map.remove(2); // removes the key-value pair with key 2

        System.out.println(map.containsKey(2)); // false

        Set<Integer> keys = map.keySet();
        System.out.println(keys); // [1, 3]

        // iterate hashmap
        System.out.println("way 1: iterating hashmap using keySet");
        for(Integer key: keys) {
            System.out.println(key + ":" + map.get(key));
        }

        System.out.println("way 2: iterating hashmap using entrySet");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for(Map.Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
