package lab11;
import java.util.Date;

public class Example3 {
    public static void main(String[] args) {

        Date birthDate = new Date(107, 10, 3);
        Student s = new Student("Полина", birthDate);

        System.out.println(s);
        System.out.println("Короткий формат: " + s.getFormat(1));
        System.out.println("Средний формат:  " + s.getFormat(2));
        System.out.println("Полный формат:  " + s.getFormat(3));
    }
}