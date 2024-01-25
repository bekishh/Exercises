import java.util.Scanner;

/***
 * 10. Напишите программу, который принимает с клавиатуры целое
 * положительное число и, если оно как минимум трехзначное и
 * положительное, уменьшает его на 1.
 * Мисалы:
 * Input: 332
 * Output: 331
 * */

public class Exersice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        System.out.println(number > 99 ? number - 1 : number);
    }
}