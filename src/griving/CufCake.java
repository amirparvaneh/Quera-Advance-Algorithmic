package griving;

import java.util.Arrays;

import java.util.Scanner;

public class CufCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            }
        for (int i = 0 ; i<n ; i++){
            for (int j = i+1 ; j<n ; j++){
                if (array[i]>array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        int ans = 0;
        if (k==1){
            ans = Arrays.stream(array).max().getAsInt();
        }else if (k==2){
             ans = Arrays.stream(array).max().getAsInt();
        }else {
           ans = Arrays.stream(array).min().getAsInt();
        }
        System.out.println(ans);

    }
}
