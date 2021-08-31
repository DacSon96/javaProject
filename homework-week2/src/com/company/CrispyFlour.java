package com.company;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private double quantity;

        public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    double getAmount() {
        return quantity * this.getCost();
    }

    @Override
    LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        if (getExpiryDate().isAfter(LocalDate.now().plusMonths(2))) {
            return this.getAmount() - this.getAmount() * 0.2;
        } else if (getExpiryDate().isAfter(LocalDate.now().plusMonths(4))) {
            return this.getAmount() - this.getAmount() * 0.4;
        } else
            return this.getAmount() - this.getAmount() * 0.05;
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                super.toString() +
                ",  quantity=" + quantity +
                "} ";
    }

}
