package org.example;

import java.util.List;
import java.util.ArrayList;

public class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    //methods for adding-removing products
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }

    //getter-setter
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
