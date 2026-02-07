package org.example.module_3_oops.inheritance.example2;

public class Main {
    public static void main(String[] args) {
        Bike bullet = new Bike();

        Bike tourer = new Bike();

        Car bmw = new Car();
        bmw.doorCount = 2;
        bmw.color = "black";
        bmw.rc = "sadfa23424afasd";
        bmw.engine = new Engine();
        bmw.engine.ManufactoringCompanyName = "honda";
        bmw.engine.power = "5000";
    }
}
