/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Enter float number:");
        double input = enterFloat();
        System.out.println(input);
    }

    public static double enterFloat() {
        Scanner input = new Scanner(System.in);
        while (true) {
            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {
                System.err.println("Invalid input. Please enter a float number using ','.");
                input.next();
            }
        }
    }
}
