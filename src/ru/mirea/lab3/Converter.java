package ru.mirea.lab3;

public class Converter {
    private String [] names = {"RUB", "USD", "EUR", "CNY"};
    private double [] toRUB = {1.0, 83.68, 93.81, 12.5};

    public int findIndex(String currency){
    for (int i=0; i < names.length; i++){
        if (names[i].equals(currency)) {
            return i;
        }
    }
    return -1;
    }
    public double getRate(String currency){
        int index = findIndex(currency);
        if(index == -1) {
            System.out.println("Неизвестная валюта: " + currency);
            return -1;
        }
        return toRUB[index];
    }
    public double convert(double amount, String from, String to) {
        double fromRate = getRate(from);
        double toRate = getRate(to);

        if (fromRate == -1 || toRate == -1) {
            return -1;
        }

        return amount * fromRate / toRate;
    }

    public void printRate(String from, String to) {
        double rate = convert(1, from, to);
        if (rate != -1) {
            System.out.printf("1 %s = %.4f %s%n", from, rate, to);
        }
    }
    public void printConversion(double amount, String from, String to) {
        double result = convert(amount, from, to);
        if (result != -1) {
            System.out.printf("%.2f %s = %.2f %s%n", amount, from, result, to);
        }
    }
}


