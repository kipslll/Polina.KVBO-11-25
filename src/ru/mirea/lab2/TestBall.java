package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball(5.1, 7.2);
        System.out.println("1: " + b1);

        b1.move(10.0, 11.1);
        System.out.println("1 после перемещения: " + b1);

        Ball b2 = new Ball();
        b2.setXY(-10.0, 5.3);
        System.out.println("2: " + b2);

        b2.setX(1);
        b2.setY(0.0);
        System.out.println("для 2 координата x: " + b2.getX());
        System.out.println("для 2 координата y: " + b2.getY());

    }
}
