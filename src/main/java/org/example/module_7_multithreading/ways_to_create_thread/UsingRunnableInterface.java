package org.example.module_7_multithreading.ways_to_create_thread;

public class UsingRunnableInterface {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            System.out.println("my thread 1 is running");

            for(int i=0; i<30; i++) {
                System.out.println("thread1 i: " + i);
            }
        };

        Runnable task2 = () -> {
            System.out.println("my thread 2 is running");

            for(int i=0; i<30; i++) {
                System.out.println("thread2 i: " + i);
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}
