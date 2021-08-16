package com.company;

public class Fan {
    private int speed;
    private boolean status;
    private double radius;
    private String color;
    Fan(int newSpeed, double newRadius, String newColor, boolean newStatus){
        speed = newSpeed;
        radius = newRadius;
        color = newColor;
        status = newStatus;
    }
    Fan() {
        speed = 1;
        radius = 5;
        color = "blue";
        status = false;

    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
    public boolean getStatus() {
        return status;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", status=" + status +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
