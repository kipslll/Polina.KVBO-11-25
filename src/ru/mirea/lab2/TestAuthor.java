package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String [] args) {
        Author one = new Author ("Полина", "lala@mail.ru", 'ж');
        Author two = new Author ("Ян", "hi@mail.ru", 'м');

        System.out.println("Автор 1: " + one);
        System.out.println("Автор 2: " + two);

        one.setEmail("new_lala@mail.ru");
        System.out.println("После изменения email: " + one);

        two.setEmail("new_hi@mail.ru");
        System.out.println("После изменения email: " + two);

        System.out.println("Имя автора 1: " + one.getName());
        System.out.println("Гендер автора 2: " + two.getGender());
    }
}
