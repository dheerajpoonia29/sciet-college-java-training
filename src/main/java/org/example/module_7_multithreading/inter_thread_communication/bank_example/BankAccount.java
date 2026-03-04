package org.example.module_7_multithreading.inter_thread_communication.bank_example;

import static java.lang.Thread.sleep;

public class BankAccount {
    // shared resource
    public int balance = 0;

    public synchronized void withdraw(String name, int amount) throws InterruptedException {
        System.out.println(name + " is trying to withdraw " + amount);

        while(balance < amount) {
            wait();
        }

        balance -= amount;
        System.out.println(name + " has withdrawn " + amount);
    }

    public synchronized void deposit(String name, int amount) throws InterruptedException {
        System.out.println(name + " is trying to deposit " + amount);
        sleep(10000);
        balance += amount;
        System.out.println(name + " has deposited " + amount);
        notify();
        System.out.println("called notify() method");
    }
}
