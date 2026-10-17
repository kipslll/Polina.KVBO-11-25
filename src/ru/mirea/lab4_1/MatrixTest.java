package ru.mirea.lab4_1;

public class MatrixTest {
    public static void main(String[] args) {

        Matrix m1 = new Matrix(2, 2);
        m1.fill(1.5);

        Matrix m2 = new Matrix(2, 2);
        m2.fill(2.5);

        System.out.println("Матрица 1:");
        m1.print();

        System.out.println("\nМатрица 2:");
        m2.print();

        System.out.println("\nСложение (m1 + m2):");
        Matrix sum = m1.add(m2);
        sum.print();

        System.out.println("\nУмножение m1 на 3:");
        Matrix multiplied = m1.multiply(3);
        multiplied.print();
    }
}


