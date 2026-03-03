package org.example.module_7_multithreading;

import static java.lang.Thread.sleep;

// SimpleProgram is single threaded process
// process means a program in execution
// here process have only one thread of execution, so it is single threaded process

public class SingleThreadedProgram {
    public static void main(String[] args) throws InterruptedException {
        SingleThreadedProgram obj = new SingleThreadedProgram();
        obj.task1();
        obj.task2();
        obj.task3();
    }

    void task1() throws InterruptedException {
        System.out.println("task 1 is started");
        sleep(5000); // Simulating a time-consuming task
        System.out.println("task 1 is completed");
    }

    void task2() {
        System.out.println("task 2 is started");
        System.out.println("task 2 is completed");
    }

    void task3() {
        System.out.println("task 3 is started");
        System.out.println("task 3 is completed");
    }

}
