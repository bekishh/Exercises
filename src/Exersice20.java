import java.util.Scanner;

/***
 * 20. Напишите программу , которая  принимает с клавиатуры
 * трехзначное положительное число и проверяет, содержится ли в
 * нем хотя бы один ноль. По результатам проверки надо вывести
 * количество нулей в числе.
 * */

public class Exersice20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите трехзначное число:");

        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        int[] digits = {digit1, digit2, digit3};
        // массивди окуп койгом
        int zero = 0;

        for (int i = 0; i < 3; i++) {
            if (digits[i] == 0) {
                zero++;
            }
        }

        System.out.println("Количество нулей в числе: " + zero);
    }
}