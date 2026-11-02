package lab9;

public class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;
    private double gpa;

    // для задания 2
    public Student(int iDNumber, String name, double gpa) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }

    // для задания 1
    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = 0.0;
    }

    public int getiDNumber() { return iDNumber; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{ID=" + iDNumber + ", name='" + name + "', GPA=" + gpa + "}";
    }
}