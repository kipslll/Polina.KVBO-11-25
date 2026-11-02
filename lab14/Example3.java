package lab14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Example3 {
    public static void main(String[] args) {
        String text = "Товар стоит 25.98 USD. Доставка 500 RUB. Скидка 0.5 EU. Брак 44 ERR.";

        String regex = "\\d+(\\.\\d+)?\\s(USD|RUB|EU)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}