package ru.mirea.lab2;

public class Computer {

    private String model;
    private int memory;
    private double price;

    public Computer(String model, int memory, double price) {
        this.model = model;
        this.memory = memory;
        this.price = price;
    }
    public String getModel(){return model;}

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory(){return memory;}

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getPrice(){return price;};

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Computer {" +
                "model: " + model +
                ", memory: "  + memory +
                ", price: " + price + "}";
    }
}

