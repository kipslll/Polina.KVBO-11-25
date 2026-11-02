package lab10;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa()); // Убывание
    }

    // 1 Quick Sort (Быстрая сортировка)
    public void quickSort(Student[] list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private int partition(Student[] list, int low, int high) {
        Student pivot = list[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (compare(list[j], pivot) < 0) {
                i++;
                Student temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        Student temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;
        return i + 1;
    }

    // 2. Merge Sort (Сортировка слиянием)
    public void mergeSort(Student[] list) {
        if (list.length < 2) return;

        int mid = list.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[list.length - mid];

        for (int i = 0; i < mid; i++) left[i] = list[i];
        for (int i = mid; i < list.length; i++) right[i - mid] = list[i];

        mergeSort(left);
        mergeSort(right);
        merge(list, left, right);
    }

    private void merge(Student[] result, Student[] left, Student[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            // Если элемент слева "больше или равен" (т.к. нам нужно по убыванию)
            if (compare(left[i], right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
    }

    // 3. Второй компаратор (задание 2 (4))
    // Вызывается так: sorter.sortByName(students);
    public void sortByName(Student[] list) {
        java.util.Arrays.sort(list, Comparator.comparing(Student::getName));
    }

    // Задания 2 и 3
    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        System.out.println("Задание 2: Сортировка по GPA (Quick Sort)");
        Student[] students1 = {
                new Student(53, "Света", 4.2),
                new Student(51, "Настя", 5.0),
                new Student(4, "Александр", 3.0),
                new Student(1, "Глеб", 4.3)
        };

        System.out.println("До сортировки:");
        printArray(students1);

        sorter.quickSort(students1, 0, students1.length - 1);
        System.out.println("\nПосле Quick Sort (по убыванию GPA):");
        printArray(students1);


        System.out.println("\nЗадание 2: Сортировка по другому полю (по имени)");
        sorter.sortByName(students1);
        System.out.println("После сортировки по имени:");
        printArray(students1);


        System.out.println("\nЗадание 3: Слияние двух списков (Merge Sort)");

        Student[] listA = {
                new Student(1, "Настя", 5.0),
                new Student(2, "Маша", 4.5)
        };
        Student[] listB = {
                new Student(3, "Таня", 4.8),
                new Student(4, "Лена", 4.2)
        };

        Student[] merged = new Student[listA.length + listB.length];
        System.arraycopy(listA, 0, merged, 0, listA.length);
        System.arraycopy(listB, 0, merged, listA.length, listB.length);

        sorter.mergeSort(merged);

        System.out.println("Объединенный и отсортированный список:");
        printArray(merged);
    }

    public static void printArray(Student[] list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}