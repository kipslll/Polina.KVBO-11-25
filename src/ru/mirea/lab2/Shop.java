package ru.mirea.lab2;

public class Shop {
    private Computer[] computers;
    private int count;

    public Shop(int size) {
        computers = new Computer[size];
        count = 0;
    }

    public void addComputer(Computer c) {
        if (count > computers.length) {
            System.out.println("Магазин заполнен, нельзя добавить: " + c.getModel());
            return;
        }

        computers[count] = c;
        count++;
        System.out.println("Добавлен: " + c.getModel());
    }

    public void removeComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equals(model)) {
                for (int j = i; j < count - 1; j++) {
                    computers[j] = computers[j + 1];
                }
                computers[count - 1] = null;
                count--;
                System.out.println("Удален: " + model);
                return;
            }
        }
        System.out.println("Компьютер не найден " + model);
    }

    public Computer findComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equals(model)) {
                return computers[i];
            }
        }
        return null;
    }

    public void printALL() {
        if (count == 0) {
            System.out.println("Магазин пуст");
            return;
        }
    System.out.println("Компьютеры в магазине: ");
        for( int i = 0; i<count; i++) {
            System.out.println(computers[i]);
        }
    }
    public int getCount() {
        return count;
    }
}
