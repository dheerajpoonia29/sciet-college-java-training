package org.example.module_5_collection_framework.queue_interface;

import java.util.ArrayDeque;

public class WaysToIterate {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();

        // enqueue: add element at the rear side
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(5);

        // 1. using for-each loop
        System.out.println("using for-each loop");
        for (Integer ele : q) {
            System.out.println(ele);
        }

        // 2. using forEach method
        System.out.println("using forEach method");
        q.forEach(ele -> System.out.println(ele));

        // 3. using while loop
        System.out.println("using while loop");
        while(q.size() > 0) {
            System.out.println(q.poll());
        }
    }
}
