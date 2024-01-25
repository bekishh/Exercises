import java.util.Random;
import java.util.Scanner;

/***
 * 29. Напишите программу, сиз консольдон эки маани алышыныз
 * керек рандом учун, биринчи сан нижний диапазон, экинчи сан
 * верхний диапазон, рандом сан бир санды генерация кылат.
 * Сиз консольдон бир сан киргизишиниз керек, эгерде сиз жазган сан
 * менен рандом сан барабар болсо, окуучу тапты деген нерсени
 * чыгарышыныз керек, болбосо окуучу таппады деген жазуу.
 * */

public class Exersice29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите нижний диапазон для рандома: ");
        int lowerRange = scanner.nextInt();

        System.out.println("Введите верхний диапазон для рандома: ");
        int upperRange= scanner.nextInt();

        int randomNumber = random.nextInt(lowerRange, upperRange);

        System.out.println("Попробуйте угадать слуачайное число: ");

        int myNumber = scanner.nextInt();

        if (randomNumber == myNumber) {
            System.out.println("Вы угадали число!");
        } else {
            System.out.println("Вы не угадали!");
        }

        System.out.println("Ваше число: " + myNumber);
        System.out.println("Случайное число: " + randomNumber);

    }
}
