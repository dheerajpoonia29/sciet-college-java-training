package org.example.module_9_advanced_java.stream_api.stream_pipeline;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOperation {
    public static void main(String[] args) {
        List<String> name = List.of("john", "michael", "susan", "anna", "peter", "alice", "bob", "adam");

        Stream<String> stream = name.stream();

        System.out.println("1 terminal operation: forEach");
        stream.map(ele -> "person " + ele).forEach(ele -> System.out.println(ele));

        System.out.println("2 terminal operation: collect");
        stream = name.stream();
        List<String> updateName = stream.map(ele -> "person " + ele).collect(Collectors.toList());

        System.out.println("3 terminal operation: count");
        stream = name.stream();
        long count = stream.filter(str -> str.length()>4).count();
        System.out.println("count of string whose length greater then 4 are " + count);

        System.out.println("4 terminal operation: reduce");
        stream = name.stream();
        String result = stream.filter(str -> str.length()>4).reduce("", (a, b) -> a+ " " +b);
        System.out.println("reduce returned result = " + result);

        System.out.println("5 terminal operation: findFirst");
        stream = name.stream();
        Optional<String> a = stream.filter(str -> str.length()>4).findFirst();
        System.out.println("findFirst returned result = " + a);

        System.out.println("6 terminal operation: anyMatch");
        stream = name.stream();
        Boolean b = stream.filter(str -> str.length()>4).anyMatch(ele -> ele.length()==10);
        System.out.println("anyMatch returned result = " + b);
    }
}
