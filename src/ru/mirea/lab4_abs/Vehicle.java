package ru.mirea.lab4_abs;

public abstract class Vehicle {
    protected String name;
    protected double speed;
    protected double costPerKm;

    public Vehicle(String name, double speed, double costPerKm) {
        this.name = name;
        this.speed = speed;
        this.costPerKm = costPerKm;
    }

    public double getTime(double distance) {
        return distance / speed;
    }

    public double getCost(double distance) {
        return distance * costPerKm;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return name + " (скорость " + speed + " км/ч, цена " + costPerKm + " руб/км)";
    }
}


