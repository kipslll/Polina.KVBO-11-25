package ru.mirea.lab4_abs;

public class Car extends Vehicle {
    public Car() {
        super("Автомобиль", 90, 15);
    }

    @Override
    public String getType() {
        return "Автомобиль";
    }
}

