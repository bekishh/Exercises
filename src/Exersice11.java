import java.util.Scanner;

/***
 * 11. Напишите программу, который принимает с клавиатуры два
 * целых числа и, если первое больше второго, выводит на экран их
 * сумму, если же наоборот - выводит на экран их произведение. В
 * случае же, если числа одинаковы, программа выводит на экран
 * сообщение Числа равны.
 * */

public class Exersice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + number2);
        } else if (number1 < number2) {
            System.out.println(number1 - number2);
        } else {
            System.out.println("Числа равны");
        }
    }
}
