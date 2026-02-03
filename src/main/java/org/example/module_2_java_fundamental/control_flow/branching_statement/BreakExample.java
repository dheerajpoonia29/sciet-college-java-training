package org.example.module_2_java_fundamental.control_flow.branching_statement;

public class BreakExample {
    public static void main(String[] args) {
        for(int i=0; i<=4; i++) {
            if(i>2) break;
            System.out.println("i = " + i);
        }
    }
}
