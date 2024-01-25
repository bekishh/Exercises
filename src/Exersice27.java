import java.util.Random;

/***
 * 27. Напишите класс, который генерирует и выводит на экран
 * случайное целое чисел из диапазона положительных двузначных
 * чисел.
 * */

public class Exersice27 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(10, 100);

        System.out.println("Случайное число: " + randomNumber);

        System.out.println("Первое число: " + random.nextInt(1, randomNumber));
        System.out.println("Второе число: " + random.nextInt(1, randomNumber));
        System.out.println("Третье число: " + random.nextInt(1, randomNumber));
    }
}
