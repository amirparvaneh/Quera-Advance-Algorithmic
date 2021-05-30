package timeAnalysis;

import java.util.Arrays;
import java.util.Scanner;

public class HalfSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        /*for (int i = 0 ; i<n ; i++){
            array[i] = scanner.nextInt();
        }*/
        int counter = 0;
        for (int i = 0; i < n; i++) {
            //array[i] = scanner.nextInt();
            if (array[i] != i) {
                counter = counter + 1;
                System.out.println(counter);
            }
        }if (counter == 2 ){
            System.out.println("YES");
        }else System.out.println("NO");

    }
}
