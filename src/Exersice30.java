import java.util.Random;
import java.util.Scanner;

public class Exersice30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Выберите: 1 - Камень, 2 - Ножницы, 3 - Бумага");
        int number = scanner.nextInt();

        if (number < 1 || number > 3) {
            System.out.println("Такого варианта ответа нет!");
            return;
        }

        int randomNumber = random.nextInt(1,4);

        String userText, randomText;

        if (number == 1) {
            userText = "Камень";
        } else if (number == 2) {
            userText = "Ножницы";
        } else {
            userText = "Бумага";
        }

        if (randomNumber == 1) {
            randomText = "Камень";
        } else if (randomNumber == 2) {
            randomText = "Ножницы";
        } else {
            randomText = "Бумага";
        }

        System.out.println("Ваш выбор: " + userText);
        System.out.println("Выбор компьютера: " + randomText);

        if (number == randomNumber) {
            System.out.println("Ничья");
        } else if ((number == 1 && randomNumber == 3) || (number == 2 && randomNumber == 1) || (number == 3 && randomNumber == 2)) {
            System.out.println("Вы выиграли");
        } else {
            System.out.println("Вы проиграли");
        }
    }
}
