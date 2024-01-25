import java.util.Scanner;

/***
 * 16. Напишите программу, который принимает с клавиатуры целое
 * число и выводит на экран его квадрат, но только в случае, если
 * введенное число отрицательно. В противном случае - на экран
 * выводится сообщение Ошибка.
 * */

public class Exersice16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println((int) Math.pow(number, 2));
        } else {
            System.out.println("Ошибка");
        }
    }
}
