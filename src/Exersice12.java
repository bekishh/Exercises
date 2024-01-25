import java.util.Scanner;

/***
 12. Трехзначное положительное число называется «четно-
 красивым», если каждая из его цифр - четная. Напишите класс,
 который принимает с клавиатуры трехзначное число и проверяет,
 является ли оно «четнокрасивым». В соответствии с результатом
 проверки надо вывести на экран соответствующее текстовое
 сообщение. Обратите внимание: задание имеет решение с
 использованием одного оператора if и без составного условия!
 * */

public class Exersice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        if (digit1 % 2 == 0 && digit2 % 2 == 0 && digit3 % 2 == 0) {
            System.out.println("Число называется «четнокрасивым»");
        }
        if (digit1 % 2 == 1 || digit2 % 2 == 1 || digit3 % 2 == 1) {
            System.out.println("Число не является «четнокрасивым»");
        }
    }
}
