import java.util.Scanner;

/***
 * 19. Трехзначное число называется «дважды четным», если и оно
 * само, и сумма его цифр - четные.
 * Напишите класс, который принимает с клавиатуры трехзначное
 * положительное число и проверяет, является ли оно «дважды
 * четным». В соответствии с результатом проверки надо вывести на
 * экран соответствующее
 * текстовое сообщение
 * */

public class Exersice19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите трехзначное число:");

        int myNumber = scanner.nextInt();
        int number = Math.abs(myNumber);

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        if (number < 1000 && number >= 100) {
            if (number % 2 == 0 && digit1 % 2 == 0 && digit2 % 2 == 0 && digit3 % 2 == 0) {
                System.out.println("Число «дважды четное»");
            } else {
                System.out.println("Число не «дважды четное»");
            }
        } else {
            System.out.println("Число не трехзначное");
        }
    }
}
