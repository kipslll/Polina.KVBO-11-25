package ru.mirea.lab4_abs;

public class Ship extends Vehicle{
    public Ship() {
        super("Корабль", 40, 20);
    }
    @Override
    public String getType() {
        return "Корабль";
    }
}
