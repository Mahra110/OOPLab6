package com.mycompany.lab06ex02;

public class Company {
    private String name;
    private Store[] arrayStore;
    private int nbStore;  
    public Company(String name) {
        this.name = name;
        this.arrayStore = new Store[10];  // Maximum 10 stores
        this.nbStore = 0;  
    }
    // Method to add a new store to the company
    public void addStore(Store s) {
        if (nbStore < 10) {
            arrayStore[nbStore] = s;
            nbStore++;
        } else {
            System.out.println("Company already has 10 stores, cannot add more.");
        }
    }

    public int searchNboFStore(String productName) {
        int count = 0;
        for (int i = 0; i < nbStore; i++) {
            if (arrayStore[i].searchProduct(productName)) {
                count++;
            }
        }
        return count;
    }

    // Method to display all stores in the company
    public void displayAll() {
        if (nbStore == 0) {
            System.out.println("No stores in the company.");
        } else {
            System.out.println("Stores in the company:");
            for (int i = 0; i < nbStore; i++) {
                System.out.println(arrayStore[i].getName());
            }
        }
    }
}

