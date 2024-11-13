package com.mycompany.lab06ex02;

public class Store {
   
    private String name;
    private String location;
    private Product[] productList;
    private int nbProduct;  // Number of products in the store (max 100)

    // Constructor to initialize store with name and location
    public Store(String name, String location) {
        this.name = name;
        this.location = location;
        this.productList = new Product[100];  // Maximum 100 products
        this.nbProduct = 0;  // Initially, no products in the store
    }

    // Method to get the store's name
    public String getName() {
        return name;
    }

    // Method to add a new product to the store
    public void addProduct(Product p) {
        if (nbProduct < 100) {
            productList[nbProduct] = p;
            nbProduct++;
        } else {
            System.out.println("Store is full, cannot add more products.");
        }
    }

    // Method to search for a product by name
    public boolean searchProduct(String productName) {
        for (int i = 0; i < nbProduct; i++) {
            if (productList[i].getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    // Method to delete a product by name and return the deleted product
    public Product deleteProduct(String productName) {
        for (int i = 0; i < nbProduct; i++) {
            if (productList[i].getName().equals(productName)) {
                Product deletedProduct = productList[i];
                // Shift all remaining products to fill the gap
                for (int j = i; j < nbProduct - 1; j++) {
                    productList[j] = productList[j + 1];
                }
                nbProduct--;  // Decrease the number of products
                return deletedProduct;
            }
        }
        System.out.println("Product not found.");
        return null;
    }

    // Method to display all products in the store
    public void displayAll() {
        if (nbProduct == 0) {
            System.out.println("No products in the store.");
        } else {
            System.out.println("Products available in store:");
            for (int i = 0; i < nbProduct; i++) {
                System.out.println(productList[i].getName());
            }
        }
    }
}

