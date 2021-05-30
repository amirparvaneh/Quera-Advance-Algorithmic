package Induction;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0 ; i<n ; i++){
            array[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(array));
        int t;
        for (int i = 0 ; i<n ; i++){
            for (int j = i+1 ; j < n ; j++){
                if (array[i]>array[j]){
                    t = array[i];
                    array[i] = array[j] ;
                    array[j] = t ;

                }
            }
        }
        for(int i = 0 ; i< n ; i++ ){
            System.out.print(array[i]+" ");
        }
    }
}
