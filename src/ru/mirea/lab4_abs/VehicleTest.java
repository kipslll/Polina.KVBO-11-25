package ru.mirea.lab4_abs;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(),
                new Plane(),
                new Train(),
                new Ship()
        };

        double distance = 10000;

        System.out.println("Расстояние: " + distance + " км\n");

        for (Vehicle v : vehicles) {
            System.out.println(v);
            System.out.printf("  Время:    %.2f ч%n", v.getTime(distance));
            System.out.printf("  Стоимость: %.2f руб%n%n", v.getCost(distance));
        }
    }
}
