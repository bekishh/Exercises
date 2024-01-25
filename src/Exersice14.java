import java.util.Scanner;

/***
 * 14. Бир программа жазыныз, сиз клавиатурадан эки сан беришиниз
 * керек, биринчи сан окуучулардын саны, экинчи отургучтардын саны.
 * Сиздер текшеришиниздер керек окуучуларга орун жетеби же
 * жетпейби.
 * Мисалы
 * Input: 25 30
 * Output: “Отургучтардын саны окуучулардан коп экен”
 * жана “Отургучтар жетет экен” , “Отургучтар жетпей калат деген”
 * варианттар болот
 * */

public class Exersice14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число учеников и стульев:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Отургучтар жетпей калат экен");
        } else if (num1 < num2) {
            System.out.println("Отургучтардын саны окуучулардан коп экен");
        } else {
            System.out.println("Отургучтар жетет экен");
        }

    }
}
