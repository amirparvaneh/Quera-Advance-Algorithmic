package period1;

import java.util.Scanner;

public class Alsopa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), n = scanner.nextInt();
        System.out.println(check(x,n));
    }
    static int res = 0;
    static int checkRecursive(int num, int x, int k, int n)
    {
        if (x == 0)
            res++;

        int r = (int)Math.floor(Math.pow(num, 1.0 / n));

        for (int i = k + 1; i <= r; i++) {
            int a = x - (int)Math.pow(i, n);
            if (a >= 0)
                checkRecursive(num,
                        x - (int)Math.pow(i, n), i, n);
        }
        return res;
    }

    // Wrapper over checkRecursive()
    static int check(int x, int n)
    {
        return checkRecursive(x, x, 0, n);
    }
}
