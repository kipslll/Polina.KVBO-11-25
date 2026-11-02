package lab9;

public class SortingStudents {
    public static void main(String[] args) {

        Student[] students = {
                new Student(53, "Света"),
                new Student(51, "Настя"),
                new Student(4, "Александр"),
                new Student(1, "Глеб"),
                new Student(3, "Полина")
        };

        System.out.println("До сортировки:");
        printArray(students);

        insertionSort(students);

        System.out.println("\nПосле сортировки (вставками):");
        printArray(students);
    }



    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j].compareTo(key) > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    public static void printArray(Comparable[] list) {
        for (Comparable item : list) {
            System.out.println(item);
        }
    }
}