import java.util.Random;
import java.util.Scanner;

public class Homework_3_guessNumber {

    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

        while (true) {
            int randomNumber = random.nextInt(10);
            int userNumber;
            int attempts = 3;
            do {
                userNumber = getCorrectNumber("Введите число от 0 до 9", 0, 9);
                if (userNumber < randomNumber) {
                    attempts--;
                    System.out.println("Неверно! Загаданное число больше! Осталось попыток: " + attempts);
                }
                if (userNumber > randomNumber) {
                    attempts--;
                    System.out.println("Неверно! Загаданное число меньше! Осталось попыток: " + attempts);
                }

            } while (attempts != 0 && userNumber != randomNumber);

            if (userNumber == randomNumber)
                System.out.println("Поздравляем!Вы угадали!");
            else
                System.out.println("Вы проиграли! Было загадано число " + randomNumber);

            int check;
            do  {
                System.out.println("Хотите сыграть ещё раз? 1 - Да / 0 - Нет");
                check = sc.nextInt();
            } while (check < 0 || check > 1);
            if (check == 1)
                System.out.println("Начинаем сначала...");
            else
                break;

        }
    }
        public static int getCorrectNumber(String s, int min, int max){
            int correctNumber;
            do {
                System.out.println(s);
                correctNumber = sc.nextInt();
            } while (correctNumber < min || correctNumber > max);
            return correctNumber;
        }

}
