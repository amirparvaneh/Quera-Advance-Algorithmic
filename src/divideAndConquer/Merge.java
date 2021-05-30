package divideAndConquer;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int[][] array = new int[k][n];
        for (int i = 0 ; i<k ; i++){
            for (int j = 0 ; j<n ; j++){
                array[i][j] = scanner.nextInt();
            }
        }

    }


        // A utility function that returns true if there is a

        // subset of arr[] with sun equal to given sum

        static boolean isSubsetSum (int arr[], int n, int sum)

        {

            // Base Cases

            if (sum == 0)

                return true;

            if (n == 0 && sum != 0)

                return false;


            // If last element is greater than sum, then ignore it

            if (arr[n-1] > sum)

                return isSubsetSum (arr, n-1, sum);


        /* else, check if sum can be obtained by any of
           the following
        (a) including the last element
        (b) excluding the last element
        */

            return isSubsetSum (arr, n-1, sum) ||

                    isSubsetSum (arr, n-1, sum-arr[n-1]);

        }


        // Returns true if arr[] can be partitioned in two

        // subsets of equal sum, otherwise false

        static boolean findPartition (int arr[], int n)

        {

            // Calculate sum of the elements in array

            int sum = 0;

            for (int i = 0; i < n; i++)

                sum += arr[i];


            // If sum is odd, there cannot be two subsets

            // with equal sum

            if (sum%2 != 0)

                return false;


            // Find if there is subset with sum equal to half

            // of total sum

            return isSubsetSum (arr, n, sum/2);

        }
    /*static int merge(int[] array, int l,int r){
        int n = array.length;
        if (n==1){
            return 1;
        }
        int mid = n/2;
        merge(array,l,mid);
        merge(array,mid,r);
        int p1 = l;
        int p2 = mid;
        int[] b ;
        while (p1<mid || p2<r){
            if (p1 == mid){

            }
        }
    }
*/
}
