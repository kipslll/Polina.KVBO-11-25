package lab13;

public class Phone {
    public static String formatPhone(String phone) {

        String digits = phone.replaceAll("[^0-9]", "");

        if (digits.startsWith("8")) {
            digits = "7" + digits.substring(1);
        }

        if (digits.length() == 11) {

            String country = digits.substring(0, 1); // 7
            String code = digits.substring(1, 4);    // 917
            String part1 = digits.substring(4, 7);   // 565
            String part2 = digits.substring(7);      // 5655

            return "+" + country + " (" + code + ") " + part1 + "-" + part2;
        }

        return "Ошибка формата";
    }

    public static void main(String[] args) {
        System.out.println(formatPhone("+79175617743"));
        System.out.println(formatPhone("89175655600"));
    }
}
