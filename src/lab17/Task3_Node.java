package lab17;

import java.util.Scanner;

public class Task3_Node {
    public String name;
    public Task3_Node next;

    public Task3_Node() {}

    public void read(Scanner sc) {
        System.out.print("Введите имя: ");
        this.name = sc.nextLine();
    }

    public void print() {
        System.out.print(name + " -> ");
    }
}