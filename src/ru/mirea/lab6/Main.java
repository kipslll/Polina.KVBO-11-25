package ru.mirea.lab6;

public class Main {
    public static void main(String[] args) {
        Priceable item = new Product("Ноутбук", 50000);

        System.out.println("Товар: " + item);
        System.out.println("Цена: " + item.getPrice() + " руб.");
    }
}