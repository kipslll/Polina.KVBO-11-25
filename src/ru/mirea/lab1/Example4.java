package ru.mirea.lab1;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Размер массива: ");
        int n = sc.nextInt();

        while (n <= 0) {
        System.out.print("Размер должен быть > 0. Введите повторно:");
        n = sc.nextInt();
        }

        int[] num = new int[n];

        int  i = 0;
        while(i < n) {
            System.out.print("Элемент " + (i+1) + ": ");
            num[i] = sc.nextInt();
            i++;
        }
        int sumWhile = 0;
        i = 0;
        while (i < n) {
            sumWhile += num[i];
            i++;
        }

        int sumDoWhile = 0;
        i = 0;
        do {
            sumDoWhile += num[i];
            i++;
        } while (i < n);

        int min = num[0];
        int max = num[0];

        i=0;
        do {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
            i++;
        } while (i < n);
        System.out.println("Сумма элементов через While: " + sumWhile);
        System.out.println("Сумма элементов через Do While: " + sumDoWhile);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

    }
}
