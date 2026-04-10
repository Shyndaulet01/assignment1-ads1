public class Palindrome {
    public static boolean isPalindrome(String s) {
        // База 1: Если осталась 1 буква или пусто — это палиндром
        if (s.length() <= 1) return true;

        // База 2: Если первая и последняя буквы разные — это НЕ палиндром
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;

        // Рекурсия: проверяем внутреннюю часть (без первой и последней буквы)
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println("Is 'radar' a palindrome? " + isPalindrome("radar"));
        System.out.println("Is 'hello' a palindrome? " + isPalindrome("hello"));
    }
}
