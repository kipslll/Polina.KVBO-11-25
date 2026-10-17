package ru.mirea.lab4_abs;

public class Plane extends Vehicle {
    public Plane() {
        super("Самолет", 800, 50);
    }

    @Override
    public String getType() {
        return "Самолет";
    }
}
