package org.example.module_3_oops.inheritance.example2;

// car is Vehicle
// we have is-a relantionship here
// car extends Vehicle

// car has engine
// it means here we have has-a relationship
// if a class is having has a relationship with another class
// it will defined an object of class engine as object type of attribute in class car
public class Car extends Vehicle {
    public Integer doorCount;
    public Engine engine;
}
