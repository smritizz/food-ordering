package com.foodorder.main;

import com.foodorder.entities.*;
import com.foodorder.payment.*;
import com.foodorder.orderprocessing.*;

import java.util.*;

public class FoodOrderingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create menu and add food items
        Menu menu = new Menu();
        menu.addFoodItem(new FoodItem(1, "Pizza", 12.99));
        menu.addFoodItem(new FoodItem(2, "Burger", 8.49));
        menu.addFoodItem(new FoodItem(3, "Pasta", 11.89));

        // Display menu
        menu.displayMenu();

        // User Input: Choose food items
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        System.out.print("Enter User Name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter User Address: ");
        String userAddress = scanner.nextLine();
        
        User user = new User(userId, userName, userAddress);

        // Create order for user
        Order order = new Order(user);

        // Add items to order
        System.out.print("Enter the number of items to order: ");
        int numItems = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter Food Item ID: ");
            int itemId = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            FoodItem selectedItem = menu.getMenuItems().get(itemId - 1);
            order.addFoodItem(selectedItem);
        }

        // Choose payment method
        System.out.println("Choose Payment Method: ");
        System.out.println("1. Credit Card");
        System.out.println("2. Wallet");
        int paymentChoice = scanner.nextInt();
        
        Payment paymentMethod;
        if (paymentChoice == 1) {
            paymentMethod = new CreditCardPayment();
        } else {
            paymentMethod = new WalletPayment();
        }

        // Process order
        OrderProcessor processor = new OrderProcessor(order);
        processor.processOrder(paymentMethod);

        // Send notification
        Notification notification = new Notification();
        notification.sendNotification("Order ID " + order.getOrderId() + " has been placed successfully!");

        scanner.close();
    }
}
