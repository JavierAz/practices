package udemy.iq;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            System.out.println(fibonacci(n - 1) + fibonacci(n - 2));
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void iterativo(int n) {
        int sum = 1, aux1 = 0, aux2 = 1;
        System.out.println(aux1);
        for (int i = 0; i < n; i++) {
            System.out.println(sum);
            sum = aux1 + aux2;
            aux1 = aux2;
            aux2 = sum;
        }
    }

    public static void main(String[] args) {
        iterativo(10);
//        System.out.println(iterativo(100));
    }
}
