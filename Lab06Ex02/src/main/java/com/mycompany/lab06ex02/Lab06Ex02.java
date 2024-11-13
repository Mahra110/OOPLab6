package com.mycompany.lab06ex02;
      public class Lab06Ex02 {
    public static void main(String[] args) {
        // Creating Product objects
        Product p1 = new Product("TV", 4, 34000);
        Product p2 = new Product("Bicycle", 4, 5500);
        Product p3 = new Product("Fridge", 3, 70000);

        // Creating Store objects
        Store s1 = new Store("Makro", "Karachi");
        Store s2 = new Store("Hypermart", "Karachi");

        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);

        s1.displayAll();

        // Deleting a product from Store 1
        Product tempProduct = s1.deleteProduct("Bicycle");
        if (tempProduct != null) {
            System.out.println("Product " + tempProduct.getName() + " is deleted.");
        } else {
            System.out.println("There is no product to delete.");
        }

        s1.displayAll();

        s2.addProduct(p1);
        s2.addProduct(p2);
        s2.addProduct(p3);

        s2.displayAll();

        // Creating a Company object and adding stores to it
        Company cl = new Company("Unilever");
        cl.addStore(s1);
        cl.addStore(s2);

        cl.displayAll();
        int n = cl.searchNboFStore("TV");
        System.out.println("Number of stores that have TV: " + n);
       }
}
