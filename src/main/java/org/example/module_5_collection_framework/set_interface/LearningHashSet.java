package org.example.module_5_collection_framework.set_interface;

import java.util.HashSet;

public class LearningHashSet {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();

        st.add(10);
        st.add(20);
        st.add(10);
        st.add(30);

        System.out.println(st.size()); // 3

        for(Integer ele: st) {
            System.out.print(ele + " ");
        }
    }
}
