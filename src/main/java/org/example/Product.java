package org.example;

public class Product {
    String name;
    double price;
    int id;

    public Product(int id, String name, double price){
        this.name = name;
        this.price = price;
        this.id = id;
    }

    //getter-setter for id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //getter-setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //getter-setter for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
