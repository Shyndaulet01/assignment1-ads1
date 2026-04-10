public class ReverseString {
    public static String reverse(String s) {
        // Базовый случай: если строка пустая, возвращаем её же
        if (s.isEmpty()) {
            return s;
        }
        // Рекурсия: берем всё кроме первой буквы, переворачиваем,
        // а первую букву клеим в самый конец.
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String test = "qwerty";
        System.out.println("Reverse of " + test + " is: " + reverse(test));
    }
}
