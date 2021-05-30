package DynamicProgramming;

import java.util.Scanner;

public class BigestZir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0 ; i<n ; i++){
            array[i]  = scanner.nextInt();
        }
        System.out.println(maxSubArraySum(array));

    }
     /*static long findMaximumSubSegment(int[]a) {
         long ans = -1000000000000l;
         long[] maximumSum = new long[a.length];
         maximumSum[1] = a[1];
         for (int i = 2; i < a.length; i++) {
             maximumSum[i] = Math.max(a[i], a[i] + maximumSum[i - 1]);
         }
         for (int j = 1; j < a.length; j++) {
             ans = Math.max(ans, maximumSum[j]);
             if (ans<0){
                 ans = ans*-1;
             }
         }
         return ans;
     }*/

    public static int maxSubArraySum(int[] arr) {

        int size = arr.length;
        int start = 0;
        int end = 0;

        int maxSoFar = 0, maxEndingHere = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > maxEndingHere + arr[i]) {
                start = i;
                maxEndingHere = arr[i];
            } else
                maxEndingHere = maxEndingHere + arr[i];

            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                end = i;
            }
        }
        return maxSoFar;
    }
}
