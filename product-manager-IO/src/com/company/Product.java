package com.company;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String date;
    private double price;

    public Product(int id, String name, String date, double price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                '}';
    }
}
