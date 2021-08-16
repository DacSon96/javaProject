package com.company;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private double quantity = 1.0;

    public CrispyFlour(LocalDate manufacturingDate, int cost, double quantity) {
        super(manufacturingDate, cost);
        super.setName("crispyFlour");
        this.quantity = quantity;
        this.setId(super.getId());
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
        int getMonth=this.getExpiryDate().getMonthValue();
        if (this.getExpiryDate().getYear()>LocalDate.now().getYear()){
            getMonth =this.getExpiryDate().getMonthValue()+12;
        }
        int dayToExpiry = getMonth - LocalDate.now().getMonthValue();
        if ((dayToExpiry <= 4) && (dayToExpiry > 2)) {
            return this.getAmount() - this.getAmount() * 0.2;
        } else if ((dayToExpiry <= 3) && (dayToExpiry >= 0)) {
            return this.getAmount() - this.getAmount() * 0.4;
        } else if (dayToExpiry < 0) {
            return -1;
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
