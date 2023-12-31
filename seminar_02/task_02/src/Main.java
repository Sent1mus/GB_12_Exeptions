public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        double[] intArray = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        System.out.println(divideArrayElements(intArray));
    }

    public static double[] divideArrayElements(double[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / (double)d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException var4) {
            System.err.println("Catching exception: " + String.valueOf(var4));
        } catch (ArrayIndexOutOfBoundsException var5) {
            System.err.println("Out of index bounds exception: " + String.valueOf(var5));
        }
        return intArray;
    }
}