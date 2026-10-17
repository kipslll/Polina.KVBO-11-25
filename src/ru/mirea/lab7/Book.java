package ru.mirea.lab7;

public class Book implements Printable {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public void print() {
        System.out.println("Книга: " + name + " (автор " + author + ")");
    }
    public static void printBooks(Printable[] printable) {
        System.out.println("Только книги: ");

        for(int i = 0; i < printable.length; i++){
            if (printable[i] instanceof Book)
                printable[i].print();
        }
    }
}
