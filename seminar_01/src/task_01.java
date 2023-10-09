import java.lang.reflect.Array;

class Answer {
    public static void arrayOutOfBoundsException() {
        Array[] arr = new Array[5];
        System.out.println(arr[5]);

    }

    public static void divisionByZero() {
        int b = 6;
        System.out.println(b/0);

    }

    public static void numberFormatException() {
        Integer.parseInt("abc");

    }
}

class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}