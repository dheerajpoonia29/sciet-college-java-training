package org.example.module_5_collection_framework.list_interface.stack;

import java.util.Stack;

public class LearningStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("top element is: " + st.peek());

        Integer removedEle = st.pop();
        System.out.println("removed element is: " + removedEle);
        System.out.println("top element is: " + st.peek());
    }
}
