import java.util.Scanner;

/***
 * 8. Напишите программу, который принимает с клавиатуры целое
 * число и, если оно положительное, увеличивает его вдвое. Класс
 * должен выводить на экран новое значение.
 * Мисалы:
 * Input: 4
 * Output: 8
 * Input: -5
 * Output: -5
 * */

public class Exersice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        System.out.println(number > 0 ? number * 2 : number);
    }
}
