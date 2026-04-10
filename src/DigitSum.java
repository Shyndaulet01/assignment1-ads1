public class DigitSum {
    public static int sum(int n) {
        // Базовый случай: если число 0, сумма его цифр 0
        if (n == 0) {
            return 0;
        }

        // Логика: последняя цифра + сумма остальных цифр
        return (n % 10) + sum(n / 10);
    }

    public static void main(String[] args) {
        int number = 234;
        System.out.println("Сумма цифр числа " + number + " = " + sum(number));
        // 2 + 3 + 4 = 9
    }
}
