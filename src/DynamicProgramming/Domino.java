package DynamicProgramming;

import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = fib(n+1);
        System.out.println(ans);
    }
    static int fib(int n)
    {
        int f[] = new int[n+2];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n; i++)
        {
            f[i] =  ((f[i-1] % 1000000007) + (f[i-2] % 1000000007)) % 1000000007;
        }
        return f[n];
    }

}
/*import java.util.*;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("" + (calculate(n)));
    }

    public static long calculate(int n) {
        long previousFib = 1;
        long currentFib = 1;
        if (n == 1 || n == 0) {
            return 1;
        }
        for (int index = 2; index <= n; index++) {
            long tmp = plus(previousFib, currentFib, 1000000007);
            previousFib = (currentFib % 1000000007);
            currentFib = tmp % 1000000007;
        }
        return currentFib;
    }

    public static long plus(long a, long b, long mod) {
        return (a % mod) + (b % mod) % mod;
    }

    public static long minus(long a, long b, long mod) {
        return (a % mod) - (b % mod) % mod;
    }
}*/
