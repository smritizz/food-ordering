package com.foodorder.payment;

public class WalletPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Wallet payment of $" + amount);
    }
}