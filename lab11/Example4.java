package lab11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Example4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите данные для создания даты:");
        System.out.print("Год: ");
        int year = sc.nextInt();
        System.out.print("Месяц (1-12): ");
        int month = sc.nextInt();
        System.out.print("День: ");
        int day = sc.nextInt();
        System.out.print("Часы: ");
        int hour = sc.nextInt();
        System.out.print("Минуты: ");
        int minute = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, 0);

        Date date = cal.getTime();

        System.out.println("\nСозданный объект Date: " + date);
        System.out.println("Созданный объект Calendar: " + cal.getTime());
    }
}