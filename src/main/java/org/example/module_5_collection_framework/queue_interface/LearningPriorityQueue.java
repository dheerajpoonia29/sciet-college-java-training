package org.example.module_5_collection_framework.queue_interface;

import java.util.Collections;
import java.util.PriorityQueue;

public class LearningPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(5);
        pq.offer(20);
        pq.offer(15);
        pq.offer(2);

        pq.forEach(ele -> System.out.print(ele + " ")); // 2 5 20 15 10

        System.out.println();

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq1.offer(10);
        pq1.offer(5);
        pq1.offer(20);
        pq1.offer(15);
        pq1.offer(2);
        pq1.forEach(ele -> System.out.print(ele + " "));

    }
}
