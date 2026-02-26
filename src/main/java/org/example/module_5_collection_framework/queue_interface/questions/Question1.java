package org.example.module_5_collection_framework.queue_interface.questions;

import java.util.ArrayDeque;
import java.util.Queue;

public class Question1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> input = new ArrayDeque<Integer>();
        input.offer(10);
        input.offer(20);
        input.offer(30);
        input.offer(40);
        input.offer(50);

        ArrayDeque<Integer> output = solve(input, 2);
        for (Integer ele : output) {
            System.out.print(ele + " ");
        }
    }

    public static ArrayDeque<Integer> solve(ArrayDeque<Integer> input, int k) {
        // write logic to remove first k element from queue
        for(int i=0; i<k; i++) {
            input.poll();
        }

        // return queue after removing first k element
        return input;
    }
}
