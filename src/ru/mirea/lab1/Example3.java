package ru.mirea.lab1;

public class Example3 {
    public static void main(String[] args) {
        int [] num = {1, 3, 4, 5, 10, 11};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double average = (double) sum / num.length;
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее = " + average);
    }
}
