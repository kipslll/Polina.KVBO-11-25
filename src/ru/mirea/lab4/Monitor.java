package ru.mirea.lab4;

public class Monitor {
    private Brand brand;
    private double diagonal;

    public Monitor(Brand brand, double diagonal) {
        this.brand = brand;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Monitor {" +
                "brand = " + brand +
                ", diagonal = " + diagonal + '}';
    }
}
