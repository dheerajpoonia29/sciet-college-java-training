package org.example.module_3_oops.class_and_objects;

public class Teacher {
    // global variable or attribute of class
    public String name = "xyz";

    public void printName() {
        // local variable
        String name = "abc";

        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.printName();
    }
}
