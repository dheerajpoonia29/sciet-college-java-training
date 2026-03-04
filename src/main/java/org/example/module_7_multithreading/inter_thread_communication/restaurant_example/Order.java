package org.example.module_7_multithreading.inter_thread_communication.restaurant_example;

public class Order {
    public boolean isOrderReady = false;

    // method1 customerMethod
    public void placeAndReceiveOrder() {

    }

    // method2 waiterMethod
    public synchronized void takeAndServeOrder() {
        // in this function you need to call wait()
    }

    // method3 chefMethod
    public synchronized void prepareAndNotifyOrder() {
        // in this function you need to call notify()
    }

}
