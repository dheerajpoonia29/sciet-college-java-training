package org.example.module_9_advanced_java.stream_api.stream_pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SourcesOfStream {
    public static void main(String[] args) {
        // 1st to create stream: using collection method stream()
        // source = Collection framework classes
        List<String> name = List.of("john", "michael", "susan", "anna", "peter", "alice", "bob", "adam");
        Stream<String> ob1 = name.stream();

        // 2nd way to create stream: by calling statis stream method from Arrays class
        // source = simple array
        int[] arr = {1,2,3,4,5,6};
        Stream ob2 = Arrays.stream(arr).boxed();

        // 3rd way to create stream: by calling static of method from stream classes
        // source = Collection framework classes
        Stream ob3 = Stream.of(name);
    }
}
