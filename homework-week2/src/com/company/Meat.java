package com.company;

import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    double getAmount() {
        return this.getCost() * this.weight;
    }

    @Override
    LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusWeeks(1);
    }

    @Override
    public double getRealMoney() {
        if (getExpiryDate().isAfter(LocalDate.now().plusDays(3))) {
            return getAmount() - getAmount() * 0.3;
        } else if (getExpiryDate().isAfter(LocalDate.now().plusDays(5))) {
            return getAmount() - getAmount() * 0.5;
        } else return getAmount() - getAmount() * 0.1;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
