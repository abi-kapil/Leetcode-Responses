import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
        if (n <= 1)
            return n;

        int prev2 = 0;
        int prev1 = 1;
        int current  = 0;

        for (int i = 1; i < n; i++) {
            current = (prev2 + prev1) % 10;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}

