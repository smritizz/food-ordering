package com.foodorder.entities;

public class User {
    private final int userId;
    private final String name;
    private final String address;

    public User(int userId, String name, String address) {
        this.userId = userId;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getUserId() {
        return userId;
    }
}
