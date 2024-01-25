import java.util.Scanner;

/***
 * 22. Назовем билет с шестизначным номером «счастливым», если
 * сумма первых трех его цифр равна сумме последних трех его цифр
 * и обе эти суммы являются четными.
 * Напишите класс, который принимает с клавиатуры шестизначный
 * номер билета и проверяет, является ли он «счастливым» или не
 * является.
 * */

public class Exersice22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите шестизначное число: ");

        int number = scanner.nextInt();

        int digit1 = number / 100000;
        int digit2 = (number / 10000) % 10;
        int digit3 = (number / 1000) % 10;
        int digit4 = (number / 100) % 10;
        int digit5 = (number / 10) % 10;
        int digit6 = number % 10;

        int sum1 = digit1 + digit2 + digit3;
        int sum2 = digit4 + digit5 + digit6;

        if (sum1 == sum2 && sum1 % 2 == 0) {
            System.out.println("У вас счастливый номер");
        } else {
            System.out.println("У вас не счастливый номер");
        }
    }
}
