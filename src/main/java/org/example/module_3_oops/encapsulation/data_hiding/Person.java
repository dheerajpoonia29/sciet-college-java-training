package org.example.module_3_oops.encapsulation.data_hiding;

public class Person {
    // public access modifier
    public int age;

    // protected access modifier
    protected String name;

    // default access modifier
    float height;

    // private access modifier
    private String city;

    public void printAge() {
        // variable with public access modifier can be used in same class
        System.out.println(age);

        // we can access variable with protected modifier in same class
        System.out.println(name);

        // we can access variable with default modifier in same class
        System.out.println(height);

        // we can access variable with private modifier in same class
        System.out.println(city);
    }
}
