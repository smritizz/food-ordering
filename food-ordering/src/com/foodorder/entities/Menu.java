package com.foodorder.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<FoodItem> menuItems = new ArrayList<>();

    public void addFoodItem(FoodItem item) {
        menuItems.add(item);
    }

    public void displayMenu() {
        System.out.println("------ Menu ------");
        for (FoodItem item : menuItems) {
            System.out.println(item);
        }
    }

    public List<FoodItem> getMenuItems() {
        return menuItems;
    }
}
