package lab14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Example2 {
    public static void main(String[] args) {

        String target = "abcdefghijklmnopqrstuv18340";

        String[] tests = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340"
        };

        Pattern pattern = Pattern.compile(target);

        for (String test : tests) {
            Matcher matcher = pattern.matcher(test);
            if (matcher.matches()) {
                System.out.println("Строка '" + test + "' - да");
            } else {
                System.out.println("Строка '" + test + "' - нет");
            }
        }
    }
}