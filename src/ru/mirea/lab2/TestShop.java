package ru.mirea.lab2;
import java.util.Scanner;
public class TestShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько компьютеров ввести?");
        int n = sc.nextInt();
        sc.nextLine();

        Shop shop = new Shop(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Компьютер " + (i+1));
            System.out.println("Модель: ");
            String model = sc.nextLine();
            System.out.println("Память (ГБ): ");
            int memory = sc.nextInt();
            sc.nextLine();
            System.out.println("Цена: ");
            double price = sc.nextDouble();
            sc.nextLine();

            shop.addComputer(new Computer(model, memory, price));
        }
        System.out.println();
        shop.printALL();

        System.out.println("Введите модель для поиска: ");
        String searchModel = sc.nextLine();
        Computer found = shop.findComputer(searchModel);
        if (found != null)
            System.out.println("Найден : " + found);
        else
            System.out.println("Не найден");

        System.out.println("Введите модель для удаления: ");
        String delModel = sc.nextLine();
        shop.removeComputer(delModel);

        System.out.println();
        shop.printALL();
    }
}
