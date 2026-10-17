package ru.mirea.lab4_abs;

public class Train extends Vehicle {
    public Train() {
        super("Поезд", 120, 8);
    }

    @Override
    public String getType() {
        return "Поезд";
    }
}
