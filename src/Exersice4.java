import java.util.Scanner;

/***
 * 4. Сиздер консольдон 3 орундуу сан киргизишиниздер керек, ошол
 * санды сиздер математикалык турдоо консольго чыгарышыныздар
 * керек
 * Мисалы:
 * Input: 364
 * Output: 300 + 60 + 4
 * */
public class Exersice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");

        int number = scanner.nextInt();

        int digit1 = number / 100 * 100;
        int digit2 = ((number / 10) % 10) * 10;
        int digit3 = number % 10;

        System.out.println(digit1 + " + " + digit2 + " + " + digit3);
    }
}
