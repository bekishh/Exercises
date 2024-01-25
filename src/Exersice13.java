import java.util.Scanner;

/***
 *  13. Бир программа жазыныздар, ал программа консольдон 2
 *  орундуу сан алыш керек, бир гана if менен текшериш керек сандын
 *  1 оруну жана 2 орунунун кобойтуусу чонбу же сан озубу
 *  Мисалы:
 *  Input: 25
 *  Output: 25>10
 *  */

public class Exersice13 {
    public static void main(String[] args) {
        System.out.println("Введите двух значное число:");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int digit1 = number / 10;
        int digit2 = number % 10;

        int multiplication = digit1 * digit2;

        if (number > multiplication) {
            System.out.println(number + ">" + multiplication);
        }
        if (number < multiplication) {
            System.out.println(number + "<" + multiplication);
        }
    }
}
