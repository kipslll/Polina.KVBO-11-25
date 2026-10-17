package ru.mirea.lab3;
import java.util.Scanner;

public class ConverterTest {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner sc = new Scanner(System.in);

        System.out.println("Курсы к рублю");
        converter.printRate("USD", "RUB");
        converter.printRate("EUR", "RUB");
        converter.printRate("CNY", "RUB");

        System.out.println("Курсы между собой");
        converter.printRate("USD", "EUR");
        converter.printRate("USD", "CNY");
        converter.printRate("EUR", "CNY");

        System.out.println("\n Конвертация");

        System.out.print("Введите сумму: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Из какой валюты (RUB/USD/EUR/CNY): ");
        String from = sc.nextLine().toUpperCase();

        System.out.print("В какую валюту (RUB/USD/EUR/CNY): ");
        String to = sc.nextLine().toUpperCase();

        converter.printConversion(amount, from, to);
    }
}