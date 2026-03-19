package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private double totalPrice;
    private Customer customer;
    private List<Product> products;

    public Order(int id, double totalPrice,List<Product> products) {
        this.id = id;
        this.totalPrice = totalPrice;
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

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

//Methods
public void setCustomer(Customer customer) {
    this.customer = customer;
}
public void addProduct(Product product) {
    products.add(product);
}
public void calculateTotalPrice() {
    double total = 0;
    for (Product product : products) {
        total = product.
    }
}
}