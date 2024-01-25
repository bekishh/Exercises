import java.util.Scanner;

/***
 * 23. Напишите класс, который принимает с клавиатуры целое число,
 * которое должно означать порядковый номер месяца. В случае если
 * полученное
 * значение действительно соответствует порядковому номеру
 * одного из месяцев, следует вывести сезон (лето, осень, зима,
 * весна), к которому относится месяц.
 * В случае если введенное значение не является порядковым
 * номером месяца, следует вывести на экран соответствующее
 * текстовое сообщение.
 * */

public class Exersice23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите порядковый номер месяца: ");

        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            String season;
            if (monthNumber >= 3 && monthNumber <= 5) {
                season = "весна";
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                season = "лето";
            } else if (monthNumber >= 9 && monthNumber <= 11) {
                season = "осень";
            } else {
                season = "зима";
            }
            System.out.println(season);
        } else {
            System.out.println("Введенное значение не является порядковым номером месяца.");
        }

    }
}
