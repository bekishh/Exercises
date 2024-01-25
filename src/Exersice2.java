import java.util.Scanner;

/***
 * 2. Сиздер консольдон 2 орундуу сан киргизишиниздер керек, ошол
  санды сиздер математикалык турдоо консольго чыгарышыныздар керек
Мисалы:

Input: 34
Output: 30 + 4

Input: 49
Output: 40 + 9
 */

public class Exersice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int digit1 = number / 10 * 10;
        int digit2 = number % 10;

        System.out.println(digit1 + " + " + digit2);
    }
}
