package org.example.module_9_advanced_java.stream_api.use_case_of_stream;

import java.util.List;

public class WithStream {
    public static void main(String[] args) {
        List<String> name = List.of("john", "michael", "susan", "anna", "peter", "alice", "bob", "adam");

        name.stream().filter(str -> str.startsWith("a")).forEach(ele -> System.out.println(ele));
    }
}
