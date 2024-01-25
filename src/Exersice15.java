import java.util.Scanner;

/***
 * 15. Бир программа жазыныз, клавиатурадан уч сан ала турган, анан
 * аларды if, else if, else жардамдары менен ушул сандарды чоною
 * тартибинде чыгарасыздар консольго.
 * Мисалы:
 * Input: 2 243 1
 * Output: 1,  2,  243
 * Input: 1 -5 92
 * Output: -5, 1,  92*/

public class Exersice15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                System.out.println(number3 + ", " + number2 + ", " + number1);
            } else {
                System.out.println(number2 + ", " + number3 + ", " + number1);
            }
        } else if (number2 > number1 && number2 > number3) {
            if (number1 > number3) {
                System.out.println(number3 + ", " + number1 + ", " + number2);
            } else {
                System.out.println(number3 + ", " + number1 + ", " + number2);
            }
        }
        else {
            if (number2 > number1) {
                System.out.println(number1 + ", " + number2 + ", " + number3);
            } else {
                System.out.println(number2 + ", " + number1 + ", " + number3);
            }
        }
    }
}
