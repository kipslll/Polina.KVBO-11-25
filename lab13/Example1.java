package lab13;

public class Example1 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        System.out.println("Исходная строка: " + str);

        // 2. Вывести последний символ
        System.out.println("1. Последний символ: " + str.charAt(str.length() - 1));

        // 3. Заканчивается ли на "!!!"
        System.out.println("2. Заканчивается на '!!!': " + str.endsWith("!!!"));

        // 4. Начинается ли с "I like"
        System.out.println("3. Начинается с 'I like': " + str.startsWith("I like"));

        // 5. Содержит ли "Java"
        System.out.println("4. Содержит 'Java': " + str.contains("Java"));

        // 6. Позиция "Java"
        System.out.println("5. Позиция 'Java': " + str.indexOf("Java"));

        // 7. Заменить 'a' на 'o'
        System.out.println("6. Замена 'a' на 'o': " + str.replace('a', 'o'));

        // 8. В верхний регистр
        System.out.println("7. Верхний регистр: " + str.toUpperCase());

        // 9. В нижний регистр
        System.out.println("8. Нижний регистр: " + str.toLowerCase());

        // 10. Вырезать "Java" (от индекса 7 до 11)
        System.out.println("9. Вырезать 'Java': " + str.substring(7, 11));
    }
}