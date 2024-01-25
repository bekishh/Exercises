import java.util.Scanner;

/***
 * 25. Напишите класс, который читает с клавиатуры символ и
 * проверяет, является ли введенный символ буквой латинского
 * алфавита. По результатам проверки следует вывести на экран
 * соответствующее сообщение.
 * */

public class Exersice25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter;
        letter = scanner.next().charAt(0);

        if (letter>='A' && letter <= 'z') {
            System.out.println("Симвой является буквой латинского алфавита");
        } else {
            System.out.println("Символ не является латниской буквой");
        }
    }
}
