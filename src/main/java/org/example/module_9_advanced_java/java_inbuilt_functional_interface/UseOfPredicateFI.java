package org.example.module_9_advanced_java.java_inbuilt_functional_interface;

import java.util.function.Predicate;

public class UseOfPredicateFI {
    public static void main(String[] args) {
        Predicate<Integer> checkVoteEligibility = (age) -> {
            System.out.println("checking vote eligibility for age: " + age);
            if(age < 18) return false;
            return true;
        };

        System.out.println(checkVoteEligibility.test(24)); // true
        System.out.println(checkVoteEligibility.test(15)); // false
    }
}
