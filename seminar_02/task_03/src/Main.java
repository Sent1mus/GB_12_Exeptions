import java.io.FileNotFoundException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, (Integer)234);
            int[] abc = new int[]{1, 2};
            abc[3] = 9;
        } catch (NullPointerException var4) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException var5) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable var6) {
            System.out.println("Что-то пошло не так...");
        }

    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}