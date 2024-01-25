import java.util.Scanner;

/***
 * 9. Напишите программу, который принимает с клавиатуры целое
 * число и выводит на экран одно из следующих сообщений:
 * “Положительное”, или “Отрицательное”, или “Ноль”, - в зависимости
 * от значения числа
 * */

public class Exersice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }
}
