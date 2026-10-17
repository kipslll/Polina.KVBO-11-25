package ru.mirea.lab4;

public class Computer {
    private String model;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(String model, Processor processor, Memory memory, Monitor monitor) {
        this.model = model;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "model = " + model + '\'' +
                ",\n  " + processor +
                ",\n  " + memory +
                ",\n  " + monitor +  '}';
    }
}

