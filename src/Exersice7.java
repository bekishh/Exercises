import java.util.Scanner;

/***
 * 7. Биз клавиатурадан 3 орундуу сан беребиз, ошол сандын ар бир
 * орундагы сандарынын суммасыны табышыбыз керек.
 * Мисалы:
 * Input: 359
 * Output: 3 + 5 + 9 = 17
 * Input: 409
 * Output: 4 + 0 + 9 = 13
 * */

public class Exersice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        int sum = digit1 + digit2 + digit3;

        System.out.println(digit1 + " + " + digit2 + " + " + digit3 + " = " + sum);
    }
}
