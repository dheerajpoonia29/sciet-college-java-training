package org.example.module_5_collection_framework.set_interface;

import java.util.LinkedHashSet;

public class LearningLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();

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
