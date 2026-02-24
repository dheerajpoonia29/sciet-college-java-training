package org.example.module_5_collection_framework.list_interface.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class WaysToIterate {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();
        arr.add("java");
        arr.add("python");
        arr.add("c++");


        System.out.println("1: using for loop");
        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("\n2: using for-each loop");
        for(String element: arr) {
            System.out.print(element + " ");
        }

        System.out.println("\n3: using while loop");
        int i = 0;
        while(i<arr.size()) {
            System.out.print(arr.get(i) + " ");
            i++;
        }

        System.out.println("\n4: using iterator interface");
        Iterator obj = arr.iterator();
        while(obj.hasNext()) {
            System.out.print(obj.next() + " ");
        }

        System.out.println("\n5: using list iterator interface");
        ListIterator obj2 = arr.listIterator();
        while(obj2.hasNext()) {
            System.out.print(obj2.next() + " ");
//            System.out.println(obj2.previous());
        }
    }
}
