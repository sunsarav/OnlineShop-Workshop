package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private double totalPrice;
    private Customer customer;
    private List<Product> products;

    public Order(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Method to connect a Customer to an Order
    public void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Order must have a customer");
        }
        this.customer = customer;
    }
    //Method to Add Products to the Order
    public void addProduct(Product product) {
        products.add(product);
    }
    //Method to Calculate Total Price - Main Logic
    public double calculateTotalPrice() {
        double total = 0;

        for (Product product : products) {
            total += product.getProductPrice();
        }
        return total;
    }
    //Method to update TotalPrice
    public void updateTotalPrice() {
        this.totalPrice = calculateTotalPrice();
    }
    //Method to Print Order details
    public void printOrderDetails() {
        if (customer != null) {
            System.out.println("Customer Name : " + customer.getCustomerName());
            System.out.println("Email-Id : " + customer.getCustomerEmail());
        }
        System.out.println();
        System.out.println("Products Ordered");
        System.out.println();

        for (Product product : products) {
            System.out.println(product.getProductId() + " - " + product.getProductName() + " costs "
                    + product.getProductPrice());
        }
        System.out.printf("Total costs for Ordered Items : %.2f SEK%n", calculateTotalPrice());
        System.out.println();
    }

}