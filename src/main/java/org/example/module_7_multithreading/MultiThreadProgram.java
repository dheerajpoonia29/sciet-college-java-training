package org.example.module_7_multithreading;

public class MultiThreadProgram {
    public static void main(String[] args) {
        Task1Thread task1 = new Task1Thread();
        Task2Thread task2 = new Task2Thread();
        Task3Thread task3 = new Task3Thread();

        task1.start(); // Start task 1 in a separate thread
        task2.start(); // Start task 2 in a separate thread
        task3.start(); // Start task 3 in a separate thread
    }
}

class Task1Thread extends Thread {
    @Override
    public void run() {
        System.out.println("task 1 is started");
        try {
            Thread.sleep(5000); // Simulating a time-consuming task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task 1 is completed");
    }
}

class Task2Thread extends Thread {
    @Override
    public void run() {
        System.out.println("task 2 is started");
        System.out.println("task 2 is completed");
    }
}

class Task3Thread extends Thread {
    @Override
    public void run() {
        System.out.println("task 3 is started");
        System.out.println("task 3 is completed");
    }
}
