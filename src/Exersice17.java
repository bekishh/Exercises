import java.util.Scanner;

/***
 * 17. Напишите программу, который принимает с клавиатуры два
 * числа: первое - количество учеников в классе, второе - количество
 * стульев в классной комнате. Программа проверит соответствие
 * между этими двумя значениями и выведет на экран
 * соответствующую информацию (например, для значений
 * 35 и 39 на экран выводится 4 стула лишних).
 * */

public class Exersice17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число учеников:");
        int num1 = scanner.nextInt();

        System.out.println("Введите число стульев:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Не хватает " + (num1 - num2) + " стулья");
        } else if (num1 < num2) {
            System.out.println(num2 - num1 + " стула лишних");
        } else {
            System.out.println("Стулья достаточны");
        }
    }
}
