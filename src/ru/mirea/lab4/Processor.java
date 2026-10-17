package ru.mirea.lab4;

public class Processor {
    private Brand brand;
    private int cores;
    private double frequency;

    public Processor(Brand brand, int cores, double frequency){
        this.brand = brand;
        this.cores = cores;
        this.frequency = frequency;
    }
    @Override
    public String toString(){
        return "Processor {" +
                "brand = " + brand +
                ", cores = " + cores +
                ", frequency = " + frequency + " GHz" + '}';
    }
}
