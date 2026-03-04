package org.example.module_7_multithreading.inter_thread_communication.restaurant_example;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

    }
}

class CustomerThread extends Thread {
    // customer place order and wait for the order to get ready and receive the order
    Order order;

    CustomerThread(Order sharedOrder) {
        this.order = sharedOrder;
    }

    @Override
    public void run() {

    }
}

class WaiterThread extends Thread {
    // waiter receive order from customer and pass the order to chef and wait for the order to get ready and serve the order to customer
    Order order;

    WaiterThread(Order sharedOrder) {
        this.order = sharedOrder;
    }

    @Override
    public void run() {

    }
}

class ChefThread extends Thread {
    // chef receive order from waiter and prepare the order and notify the waiter that the order is ready
    Order order;

    ChefThread(Order sharedOrder) {
        this.order = sharedOrder;
    }

    @Override
    public void run() {

    }
}