package org.example.module_5_collection_framework.queue_interface.questions;

import java.util.ArrayDeque;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba")); // true
        System.out.println(isPalindrome("abccba")); // true
        System.out.println(isPalindrome("abc")); // false
        System.out.println(isPalindrome("a")); // true
        System.out.println(isPalindrome("abccza")); // false
        System.out.println(isPalindrome("abczba")); // false
    }

    public static boolean isPalindrome(String str) {
        ArrayDeque<Character> q = new ArrayDeque<>();

        // enqueue all characters of string in queue
        for(Character ch: str.toCharArray()) {
            q.offer(ch);
        }

        while(q.size() > 1) {
            char firstChar = q.removeFirst(); // deque from front side
            char lastChar = q.removeLast(); // deque from rear side
            if (firstChar != lastChar) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome1(String str) {
        // write logic to check if given string is palindrome or not using queue
        // return true if string is palindrome otherwise return false

        int l = 0;
        int r = str.length()-1;

        while(l<r) {
            if(str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
