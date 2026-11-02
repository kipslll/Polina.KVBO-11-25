package lab14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Example7 {
    public static void main(String[] args) {

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[a-zA-Z0-9_]{8,}$";

        String[] tests = {
                "F032_Password",
                "TrySpy1",
                "A007"       
        };

        Pattern pattern = Pattern.compile(regex);

        for (String pass : tests) {
            Matcher matcher = pattern.matcher(pass);
            if (matcher.matches()) {
                System.out.println("Пароль '" + pass + "' - надежный");
            } else {
                System.out.println("Пароль '" + pass + "' - слабый");
            }
        }
    }
}