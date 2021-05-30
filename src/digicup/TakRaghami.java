package digicup;

import java.util.Scanner;

public class TakRaghami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        System.out.println(sumDigits(n));
    }
    static int sumDigits(long no)
    {
        return no == 0 ? 0 : (int) (no % 10 +
                sumDigits(no / 10));
    }
}
