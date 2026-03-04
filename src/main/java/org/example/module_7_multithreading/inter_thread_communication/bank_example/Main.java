package org.example.module_7_multithreading.inter_thread_communication.bank_example;

public class Main {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();

        Thread1 t1 = new Thread1(sharedAccount);
        Thread2 t2 = new Thread2(sharedAccount);

        t1.start();
        t2.start();
    }
}

// thread 1 will use for withdraw
class Thread1 extends Thread {
    BankAccount account;

    Thread1(BankAccount sharedAccount) {
        this.account = sharedAccount;
    }

    @Override
    public void run() {
        try {
            account.withdraw("ram", 100);
        } catch(InterruptedException e) {
            System.out.println("InterruptedException occured in thread 1");
        }

    }
}


// thread 2 will use for deposit
class Thread2 extends Thread {
    BankAccount account;

    Thread2(BankAccount sharedAccount) {
        this.account = sharedAccount;
    }

    @Override
    public void run() {
        try {
            account.deposit("shyam", 100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}