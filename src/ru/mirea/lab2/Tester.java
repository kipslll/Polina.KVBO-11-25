package ru.mirea.lab2;

public class Tester {
    private Circle [] circles;
    private int count;

    public Tester(int size){
        circles = new Circle[size];
        count = 0;
    }
    public void addCircle(Circle c){
        if(count < circles.length){
            circles[count] = c;
            count ++;
        }
    }
    public void printALL() {
        System.out.println("Количество окружностей: " + count);
        for (int i=0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }
    public static void main(String [] args){
       Tester tester = new Tester(3);
       tester.addCircle(new Circle(new Point(0, 3), 4.0));
       tester.addCircle(new Circle(new Point(3, 2), 3.5));
        tester.addCircle(new Circle(new Point(-1.1, -2.2), 3.6));
       tester.printALL();
    }
}
