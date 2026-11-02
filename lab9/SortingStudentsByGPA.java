package lab9;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }

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

    public static void main(String[] args) {
        Student[] students = {
                new Student(53, "Света", 4.2),
                new Student(51, "Настя", 5),
                new Student(4, "Александр", 3.0),
                new Student(1, "Глеб", 4.3),
                new Student(3, "Полина", 4.5)
        };

        System.out.println("До сортировки по GPA:");
        for (Student s : students) {
            System.out.println(s);
        }

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("\nПосле сортировки по GPA (по убыванию):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}