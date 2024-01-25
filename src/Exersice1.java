import java.util.Scanner;

/***
 * 1. Сиздер консольдон уч орундуу сан бересиздер, ошол санды
    сиздер наобороттун чыгарып жана ортосунан болуп салышынздар керек
Мисалы:

Input:  457
Output: 7 5 4
 */

public class Exersice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");

        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        System.out.println(digit3 + " " + digit2 + " " + digit1);
    }
}
