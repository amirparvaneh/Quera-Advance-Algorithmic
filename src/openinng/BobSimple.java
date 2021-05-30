package openinng;

import java.util.Scanner;

public class BobSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0 ; i<n ; i++){
            array[i] = scanner.nextInt();
        }
        int counter = 0;
        for (int x = -100000 ;x<=100000;x++){
            int counter_2 = 0;
            for (int i = 0 ; i<n ;i++){
                counter_2 += Math.abs(x+(i+1-1)*k-array[i]);
            }
            if (counter == 0 || counter_2<counter){
                counter = counter_2;
            }

        }
        System.out.println(counter);
    }
}
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int counter = 0;

        for (int x = -100000; x <= 100000; x++) {
            int newCounter = 0;
            for (int i = 0; i < n; i++) {
                newCounter += Math.abs(x + (i + 1 - 1) * k - a[i]);
            }
            if (counter == 0 || newCounter < counter) {
                counter = newCounter;
            }
        }

        System.out.println("" + counter);
    }
}
*/
