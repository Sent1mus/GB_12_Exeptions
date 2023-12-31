/*Разработайте программу, которая выбросит Exception, когда пользователь
вводит пустую строку. Пользователю должно показаться сообщение, что
пустые строки вводить нельзя.
*/

import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the string: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new Exception("Null string was entered, you cannot enter null strings");
            } else {
                System.out.println("You have entered: " + input);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
