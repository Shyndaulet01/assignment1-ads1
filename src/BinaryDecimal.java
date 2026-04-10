public class BinaryDecimal {
    public static int bin2dec(String s) {
        if (s.length() == 0) return 0;

        // Берем первый символ, превращаем в число (0 или 1)
        int firstDigit = Character.getNumericValue(s.charAt(0));

        // Считаем вес этой цифры: цифра * 2^(оставшаяся длина)
        int power = (int) Math.pow(2, s.length() - 1);

        return (firstDigit * power) + bin2dec(s.substring(1));
    }

    public static void main(String[] args) {
        System.out.println("1010 в десятичной: " + bin2dec("1010")); // 10
    }
}
