import java.util.Scanner;

/***
 * 21. Напишите класс, который принимает с клавиатуры
 * положительное целое число и выводит на экран ближайшее к нему
 * «крутлое число».
 * Например, для введенного значения 433 выводится на экран 430, а
 * для 56 выводится 60.
 * */

public class Exersice21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");

        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        if (number > 9 && number < 100) {
            System.out.println((digit3 >= 5 ? digit2 + 1 : digit2) + "0");
        } else if (number > 99 && number < 1000) {
            System.out.println(digit1 + "" + (digit3 >= 5 ? digit2 + 1 : digit2) + "0");
        } else {
            System.out.println(number);
        }
    }
}
