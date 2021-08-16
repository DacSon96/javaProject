package com.company;

import java.time.LocalDate;

public class Meat extends Material {
    private double weight = 1.0;

    public Meat(LocalDate manufacturingDate, int cost, double weight) {
        super(manufacturingDate, cost);
        super.setName("meat");
        this.weight = weight;
        this.setId(super.getId());
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
        int dayToExpiry = this.getExpiryDate().getDayOfYear() - LocalDate.now().getDayOfYear();
        if ((dayToExpiry <= 5)&& (dayToExpiry > 3)) {
            return this.getAmount() - this.getAmount() * 0.3;
        } else if ((dayToExpiry <= 3) && (dayToExpiry>=0)) {
            return this.getAmount() - this.getAmount() * 0.5;
        } else if (dayToExpiry<0){
            return -1;
        } else
            return this.getAmount() - this.getAmount() * 0.1;
    }

}
