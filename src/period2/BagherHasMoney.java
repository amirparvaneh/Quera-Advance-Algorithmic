package period2;

import java.util.Scanner;

public class BagherHasMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0 ; i<n ; i++ ){
            array[i] = scanner.nextInt();
        }
    }
}
