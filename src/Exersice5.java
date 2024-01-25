import java.util.Scanner;

/***
 * 5. Напишите программу, который принимает с клавиатуры целое
 * положительное двузначное число. Затем следует построить новое
 * значение, составленное из цифр числа, введенного с клавиатуры,
 * но в обратном порядке. После этого новое значение следует
 * увеличить на 8, и окончательный результат вывести на экран.
 * Мисалы:
 * Input: 37
 * Output: 81
 * */

public class Exersice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int digit1 = number / 10;
        int digit2 = number % 10;

        int sum = digit1 + digit2 + 8;

        int num1 = sum / 10;
        int num2 = sum % 10;

        System.out.println(num2 + "" + num1);
    }
}
