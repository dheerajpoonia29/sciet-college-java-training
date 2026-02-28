package org.example.module_5_collection_framework.set_interface;

import java.util.TreeSet;

public class LearningTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> st = new TreeSet<>();

        st.add(20);
        st.add(10);
        st.add(30);
        st.add(10);

        System.out.println(st.size()); // 3

        for(Integer ele: st) {
            System.out.print(ele + " ");
        }
    }
}
