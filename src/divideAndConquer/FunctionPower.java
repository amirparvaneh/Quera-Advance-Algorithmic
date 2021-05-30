package divideAndConquer;

import java.util.Scanner;

public class FunctionPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double exp = scanner.nextDouble();
        System.out.printf("%.3f",Math.pow(base,exp));
    }
}
