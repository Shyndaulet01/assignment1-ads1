public class ReverseInteger {

    public static void printReversal(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }
        System.out.print(n % 10);
        printReversal(n / 10);
    }

    public static void main(String[] args) {
        System.out.print("Переворот числа 12345: ");
        printReversal(12345);
        System.out.println();
    }
}