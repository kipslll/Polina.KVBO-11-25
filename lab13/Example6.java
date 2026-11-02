package lab13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова через пробел:");
        String input = sc.nextLine();

        String[] words = input.split("\\s+");

        List<String> list = new ArrayList<>();
        for (String w : words) list.add(w);

        StringBuilder result = new StringBuilder();

        String currentWord = list.remove(0);
        result.append(currentWord).append(" ");

        while (!list.isEmpty()) {

            char lastChar = currentWord.toLowerCase().charAt(currentWord.length() - 1);

            boolean found = false;
            for (int i = 0; i < list.size(); i++) {
                String nextWord = list.get(i);

                if (nextWord.toLowerCase().charAt(0) == lastChar) {
                    result.append(nextWord).append(" ");
                    currentWord = nextWord;
                    list.remove(i);
                    found = true;
                    break;
                }
            }

            if (!found) break;
        }

        System.out.println("Результат: " + result.toString().trim());
    }
}
