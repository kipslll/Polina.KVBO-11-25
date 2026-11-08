package lab17;

import java.util.Scanner;

public class Task2_Node {
    public String name;
    public Task2_Node next;
    public Task2_Node prev;

    public Task2_Node() {}

    public void read(Scanner sc) {
        System.out.print("Введите имя: ");
        this.name = sc.nextLine();
    }

    public void print() {
        System.out.print(name + " <-> ");
    }
}