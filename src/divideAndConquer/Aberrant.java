package divideAndConquer;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aberrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int l = array[0];
        int r = array[n - 1];
        int mid = (r + l) / 2;


    }
     /*   static int inversion(int[] array , int l ,int r) {
            int mid = (l+r)/2;
            int n = array.length;
            int[] a1 = new int[n/2];
            int[] a2 = new int[n/2];

    }*/
}
/*int ans = 0 ;
        for (int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if (array[i]<array[j])continue;
                else {
                    ans += 1;
                }
            }
        }
        System.out.println(ans);*/