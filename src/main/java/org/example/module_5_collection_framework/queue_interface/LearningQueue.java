package org.example.module_5_collection_framework.queue_interface;

import java.util.ArrayDeque;

public class LearningQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();

        // enqueue: add element at the rear side
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(5);

        // 10 20 30 5
        // peek: return element at the front side
        System.out.println(q.peek()); // 10

        // dequeue: remove element from the front side
        int ele = q.poll(); // 10

        System.out.println(q.peek()); // 20
    }
}
