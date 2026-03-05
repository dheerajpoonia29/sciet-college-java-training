package org.example.module_7_multithreading.inter_thread_communication.restaurant_example;

import static java.lang.Thread.sleep;

public class Order {
    public boolean isOrderReady = false;
    public boolean isOrderReceived = false;

    // method1 consumed customer thread
    public void placeAndReceiveOrder() {
        System.out.println("Customer placed the order.");
        try {
            while(isOrderReceived == false) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Customer received the order from waiter.");
    }

    // method2 waiterMethod
    public synchronized void takeAndServeOrder() {
        // in this function you need to call wait()
        System.out.println("Waiter received the order from customer and passed it to chef.");
        try {
            while(isOrderReady == false) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Waiter get the order from chef.");
        System.out.println("Waiter is going to serve order...");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isOrderReceived = true;
        System.out.println("Waiter served the order to customer.");
        notify();
    }

    // method3 chefMethod
    public synchronized void prepareAndNotifyOrder() {
        // in this function you need to call notify()

        System.out.println("Chef received the order from waiter");
        System.out.println("Chef is preparing the order...");
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        isOrderReady = true;
        System.out.println("Chef prepared the order");
        notify();
    }

}
