import java.util.Scanner;

/***
 * 26. Напишите класс, который принимает с клавиатуры два
 * строковых значения, каждое из которых содержит имя человека, и
 * проверяет, являются ли эти люди тезками. По результатам
 * проверки следует вывести на экран соответствующее сообщение.
 * */

public class Exersice26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите второе имя: ");
        String secondName = scanner.nextLine();

        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Эти люди тезки.");
        } else {
            System.out.println("Эти люди не тезки.");
        }
    }
}
