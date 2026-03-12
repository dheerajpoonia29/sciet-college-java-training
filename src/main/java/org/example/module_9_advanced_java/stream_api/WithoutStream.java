package org.example.module_9_advanced_java.stream_api;

import java.util.List;

public class WithoutStream {
    public static void main(String[] args) {
        List<String> name = List.of("john", "michael", "susan", "anna", "peter", "alice", "bob", "adam");

        for(String str: name) {
            if(str.startsWith("a")) {
                System.out.println(str);
            }
        }
    }
}
