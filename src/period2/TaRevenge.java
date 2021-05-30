package period2;

import java.util.Scanner;

public class TaRevenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n+10];
        int[] b = new int[n+10];
        a[2] = 3;
        b[1] = 1;
        for (int i = 3; i <= n; i++) {
            a[i] = 3 * a[i - 2] + 2 * b[i - 1];
            b[i] = a[i - 3] + b[i - 2];
        }
        System.out.println(2*a[n]);
    }

}
