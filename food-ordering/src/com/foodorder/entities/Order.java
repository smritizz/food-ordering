package com.foodorder.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderCounter = 1;
    private int orderId;
    private User user;
    private List<FoodItem> orderedItems = new ArrayList<>();
    private double totalAmount;

    public Order(User user) {
        this.orderId = orderCounter++;
        this.user = user;
    }

    public void addFoodItem(FoodItem foodItem) {
        orderedItems.add(foodItem);
    }

    public void calculateTotalAmount() {
        totalAmount = 0;
        for (FoodItem item : orderedItems) {
            totalAmount += item.getPrice();
        }
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public List<FoodItem> getOrderedItems() {
        return orderedItems;
    }
}
