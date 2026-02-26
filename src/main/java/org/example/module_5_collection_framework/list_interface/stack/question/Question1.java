package org.example.module_5_collection_framework.list_interface.stack.question;

import java.util.Stack;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(validParantheses("{[()]}")); // true

        System.out.println(validParantheses("{[()}]")); // false
    }

    public static boolean validParantheses(String str) {
        // write logic to check whether the given string is valid parantheses or not
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            Character ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if(st.size()==0) return false;

                Character topEle = st.pop();

                if(topEle == '(') {
                    if(ch != ')') return false;
                } else if(topEle == '{') {
                    if(ch != '}') return false;
                } else {
                    if(ch != ']') return false;
                }
            }
        }

        return true;
    }
}
