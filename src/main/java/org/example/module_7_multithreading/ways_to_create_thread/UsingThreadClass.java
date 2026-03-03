package org.example.module_7_multithreading.ways_to_create_thread;

public class UsingThreadClass {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();

        obj1.start();
        obj2.start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        System.out.println("my thread 1 is running");

        for(int i=0; i<30; i++) {
            System.out.println("thread1 i: " + i);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("my thread 2 is running");

        for(int i=0; i<30; i++) {
            System.out.println("thread2 i: " + i);
        }
    }
}
