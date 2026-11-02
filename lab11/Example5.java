package lab11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        int N = 100000;

        System.out.println("Тестирование производительности на " + N + " элементах\n");

        long start = System.currentTimeMillis();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList  - Добавление в конец: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.add(i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList - Добавление в конец: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.add(0, i);
        end = System.currentTimeMillis();
        System.out.println("\nArrayList  - Добавление в начало (10 000): " + (end - start) + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.add(0, i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList - Добавление в начало (10 000): " + (end - start) + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.get(N / 2);
        end = System.currentTimeMillis();
        System.out.println("\nArrayList  - Поиск по индексу (10 000 раз): " + (end - start) + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.get(N / 2);
        end = System.currentTimeMillis();
        System.out.println("LinkedList - Поиск по индексу (10 000 раз): " + (end - start) + " мс");
    }
}
