package ru.mirea.lab7;

public class TestBook {
    public static void main(String[] args) {
        Printable[] items = {
                new Book("Трое в лодке, не считая собаки", "Джером К. Джером"),
                new Magazine("Мурзилка"),
                new Book("Гарри Поттер", "Дж. К. Роулинг"),
                new Magazine("Правда")};
        Book.printBooks(items);
    }
}
