package com.foodorder.orderprocessing;

import com.foodorder.entities.Order;
import com.foodorder.payment.Payment;

public class OrderProcessor {
    private Order order;

    public OrderProcessor(Order order) {
        this.order = order;
    }

    public void processOrder(Payment paymentMethod) {
        order.calculateTotalAmount();
        paymentMethod.processPayment(order.getTotalAmount());
    }
}
