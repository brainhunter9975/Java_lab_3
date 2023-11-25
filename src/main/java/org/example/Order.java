package org.example;


import java.util.List;
import java.util.ArrayList;

enum OrderStatus {
    PENDING,
    PROCESSING,
    COMPLETED,
    CANCELED
}

public class Order {
    private int orderId;
    private List<Product> products;
    private OrderStatus status;

    public Order(int orderId, List<Product> products, OrderStatus status) {
        this.orderId = orderId;
        this.products = products;
        this.status = status;
    }

    // Геттери і сеттери для атрибутів
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
