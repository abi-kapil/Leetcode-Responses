import java.util.Scanner;


public class FibonacciNumber {
    public static long fibonacci(long n) {
        if (n <= 1) return n;
          long prev2 = 0;
          long prev1 = 1;

        for (int i = 1; i < n; i++) {
            long current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
    }
    return prev1;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
        scanner.close();
    }
}
