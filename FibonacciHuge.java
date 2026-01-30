import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        long remainder = n % GetPisanoPeriod(m);

        for (long i = 1; i < remainder; i++) {
            long tmp_previous = (previous + current) % m;
            previous = current;
            current =   tmp_previous;
        }

        return current;
    }

    private static long GetPisanoPeriod(long m) {
        long previous = 0;
        long current  = 1;
        long pisanoPeriod = 0;

        for (long i = 0; i < m * m; i++) {
            long tmp_previous = (previous + current) % m;
            previous = current;
            current =   tmp_previous;

            pisanoPeriod++;

            if (previous == 0 && current == 1)
                return pisanoPeriod;
        }

        return pisanoPeriod;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
        scanner.close();
    }
}

