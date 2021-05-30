package openinng;

import java.util.Arrays;
import java.util.Scanner;

public class GholiLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), q = scanner.nextInt();
        int[] tolerable_heat = new int[1000];
        int[] temperature = new int[1000];
        for (int i = 0 ; i<n ; i++){
            tolerable_heat[i]  = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(tolerable_heat));
        for (int i = 0 ; i<q ; i++){
            temperature[i] = scanner.nextInt();
        }
       // System.out.println(Arrays.toString(temperature));

        for (int i = 0 ; i < q ; i++){
            int counter = 0;
            for (int j = 0 ; j<n ; j++){
                if (tolerable_heat[j]>=temperature[i]){

                }else counter++;
            }System.out.println(counter);
        }

    }
}