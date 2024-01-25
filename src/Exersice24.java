import java.util.Scanner;

/***
 * 24. Напишите класс, который принимает с клавиатуры
 * положительное трехзначное число и проверяет, сколько разных
 * цифр оно содержит.
 * */

public class Exersice24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите трёх значное число:");

        int number = scanner.nextInt();

        if (number > 99 && number < 1000) {
            int digit1 = number / 100;
            int digit2 = (number / 10) % 10;
            int digit3 = number % 10;

            int coincidences = 1;

            if (digit1 != digit2 && digit1 != digit3) {
                coincidences++;
            }
            if (digit2 != digit3) {
                coincidences++;
            }
            System.out.println("Число содержит " + coincidences + " разных цифр");
        } else {
            System.out.println("Введите трех значное число!");
        }
    }
}
