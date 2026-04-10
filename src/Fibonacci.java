public class Fibonacci {
    static int count = 0;
    static int fib(int n) {
        count++;
        if (n <= 1) return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n=5;
        int result = fib(n);
        System.out.println(n+"-e чиссло Фибоначчи");
        System.out.println("Метод был вызван раз:"+count);
    }
}
