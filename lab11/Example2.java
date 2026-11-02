package lab11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        System.out.print("Введите дату в формате дд.мм.гггг: ");
        String userInput = sc.nextLine();

        try {

            Date userDate = sdf.parse(userInput);

            Date currentDate = sdf.parse(sdf.format(new Date()));

            System.out.println("Введенная дата: " + sdf.format(userDate));
            System.out.println("Текущая дата:   " + sdf.format(currentDate));

            int result = userDate.compareTo(currentDate);
            if (result == 0) {
                System.out.println("Введенная дата равна текущей.");
            } else if (result > 0) {
                System.out.println("Введенная дата в будущем.");
            } else {
                System.out.println("Введенная дата в прошлом.");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты");
        }
    }
}