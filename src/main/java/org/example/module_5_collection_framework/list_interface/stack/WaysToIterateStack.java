package org.example.module_5_collection_framework.list_interface.stack;

import java.util.Stack;

public class WaysToIterateStack {
    public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();

            st.push(10);
            st.push(20);
            st.push(30);

            // 1. using for loop
            System.out.println("using for loop");
            for (int i = 0; i < st.size(); i++) {
                System.out.println(st.get(i));
            }

            // 2. using for-each loop
            System.out.println("using for-each loop");
            for (Integer ele : st) {
                System.out.println(ele);
            }

            // 3. using while loop
            System.out.println("using while loop");
            while(st.size() > 0) {
                System.out.println(st.pop());
            }
    }
}
