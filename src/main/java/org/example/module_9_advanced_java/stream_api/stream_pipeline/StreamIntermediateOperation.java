package org.example.module_9_advanced_java.stream_api.stream_pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamIntermediateOperation {
    public static void main(String[] args) {
        // source
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,1,5,3,4,5,6,7,8));

        // get stream from source
        Stream<Integer> stream = arr.stream();



        // intermediate operation 1: filter
        System.out.println("using filter intermediate operation");
        stream.filter(ele -> {
            if(ele>3 && ele<6) return true;
            return false;
        }).forEach(ele -> System.out.println(ele));

        // intermediate operation 2: map
        System.out.println("using map intermediate operation");
        stream = arr.stream();
        stream.map(ele -> {
            return ele/2;
        }).forEach(ele -> System.out.println(ele));

        // intermediate operation 3: sorted
        System.out.println("using sorted intermediate operation");
        stream = arr.stream();
        stream.sorted((a,b) -> b-a).forEach(ele -> System.out.println(ele));

        System.out.println("using distinct intermediate operation");
        stream = arr.stream();
        stream.distinct().forEach(ele -> System.out.println(ele));

        System.out.println("using limit intermediate operation");
        stream = arr.stream();
        stream.limit(3).forEach(ele -> System.out.println(ele));

        System.out.println("using skip intermediate operation");
        stream = arr.stream();
        stream.skip(3).forEach(ele -> System.out.println(ele));
    }
}
