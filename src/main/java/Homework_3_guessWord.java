import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_3_guessWord {
    public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                    "\ncherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "\nolive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String[] hide = {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"};
        int random = rand.nextInt(words.length);
        String randomWord = words[random];
        System.out.println("Отгадайте слово из приведенного списка:");
        System.out.println(Arrays.toString(words) + "\nКакое слово загадано?");

        while (true) {
            String userAnswer = sc.nextLine();

            if (userAnswer.equals(randomWord)) {
                System.out.println("Правильно!");
                break;
            } else {
                System.out.println("Неправильно! Попробуйте ещё раз!");
                checkSymbols(hide, randomWord, userAnswer);
                System.out.println();
            }
        }
    }

    private static void checkSymbols(String[] hide, String randomWord, String userAnswer) {
        for (int i = 0; i < hide.length; i++) {
            if (i < randomWord.length() && i < userAnswer.length()) {
                char y = userAnswer.charAt(i);
                char z = randomWord.charAt(i);
                if (y == z) {
                    System.out.print(y);
                } else
                    System.out.print(hide[i]);
            } else
                System.out.print(hide[i]);
        }
    }
}
