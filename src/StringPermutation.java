public class StringPermutation {
    public static void printPermutations(String s) {
        recursivePermute("", s);
    }

    // Вспомогательный рекурсивный метод
    private static void recursivePermute(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix); // Когда букв не осталось, печатаем результат
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            // Берем одну букву и переносим её в префикс
            String newPrefix = prefix + remaining.charAt(i);
            // Оставшиеся буквы без той, которую взяли
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);

            recursivePermute(newPrefix, newRemaining);
        }
    }

    public static void main(String[] args) {
        printPermutations("abc");
    }
}
