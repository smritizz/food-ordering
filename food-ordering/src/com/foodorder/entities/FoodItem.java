package com.foodorder.entities;

public class FoodItem {
    private int itemId;
    private String name;
    private double price;

    public FoodItem(int itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return itemId + ". " + name + " - $" + price;
    }
}
