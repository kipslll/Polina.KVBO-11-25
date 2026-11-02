package lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example1 {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        Date dateReceived = new Date(126, 9, 1, 10, 0, 0);

        Date dateSubmitted = new Date();

        System.out.println("Разработчик: Полина");
        System.out.println("Дата получения задания: " + sdf.format(dateReceived));
        System.out.println("Дата сдачи задания:    " + sdf.format(dateSubmitted));
    }
}
