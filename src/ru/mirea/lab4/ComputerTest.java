package ru.mirea.lab4;

public class ComputerTest {
    public static void main(String[] args) {

        Processor cpu = new Processor(Brand.INTEL, 8, 3.4);
        Memory ram = new Memory(Brand.SAMSUNG, 16);
        Monitor mon = new Monitor(Brand.LG, 27.0);

        Computer pc = new Computer("Gaming PC", cpu, ram, mon);

        System.out.println(pc);
    }
}
