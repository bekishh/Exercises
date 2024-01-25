import java.util.Scanner;

/***
 * 6. Напишите программу, который принимает с клавиатуры целое
 * положительное трехзначное число. Затем следует построить новое
 * значение, составленное
 * из цифр числа, введенного с клавиатуры, но в обратном
 * порядке. После этого новое значение следует уменьшить на 20, и
 * окончательныйрезультат вывести на экран.
 * Мисалы:
 * Input: 327
 * Output: 703
 * */

public class Exersice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        int reverseNumber = Integer.parseInt(digit3 + "" + digit2 + "" + digit1);


        System.out.println(reverseNumber - 20);
    }
}
