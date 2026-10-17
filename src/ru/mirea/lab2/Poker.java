package ru.mirea.lab2;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] signs = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Валет", "Дама", "Король", "Туз"};

        String[] card = new String[52];
        int k = 0;
        for(String suit: suits) {
            for(String sign: signs) {
                card[k] = sign + " " + suit;
                k++;
            }
        }

        Random random = new Random();
        for (int i = card.length - 1; i>0; i--) {
            int j = random.nextInt(i + 1);
            String temp = card[i];
            card[i] = card[j];
            card[j] = temp;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число игроков: ");
        int n = sc.nextInt();

        if (n*5 > 52) {
            System.out.println("Слишком много игроков (максимум 10)");
            return;
        }
        int cardIndex = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Игрок " + i + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(" " + card[cardIndex]);
                cardIndex++;
            }
        }
        System.out.println();
    }
}
