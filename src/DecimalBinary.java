public class DecimalBinary {
    public static String dec2bin(int n) {
        if (n == 0) return "0"; // База: если 0, то 0
        if (n == 1) return "1"; // База: если 1, то 1

        // Рекурсия: делим на 2 и приклеиваем остаток в конец
        return dec2bin(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        System.out.println("10 в двоичной: " + dec2bin(10)); // 1010
    }
}
