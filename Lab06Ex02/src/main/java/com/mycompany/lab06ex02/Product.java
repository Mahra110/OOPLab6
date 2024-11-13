package com.mycompany.lab06ex02;

public class Product {
 
    private String name;
    private int quantity;
    private double price;

    // Constructor to initialize the product details
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to get the product's name
    public String getName() {
        return name;
    }

    // Optional: Other getters for quantity and price if needed
    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

