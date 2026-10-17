package ru.mirea.lab4;

public class Memory {
    private Brand brand;
    private int sizeGB;

    public Memory(Brand brand, int sizeGB) {
        this.brand = brand;
        this.sizeGB = sizeGB;
    }

    @Override
    public String toString() {
        return "Memory {" +
                "brand = " + brand +
                ", size = " + sizeGB + " GB" + '}';
    }
}

