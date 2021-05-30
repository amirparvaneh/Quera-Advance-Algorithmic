package griving;
import java.util.Arrays;
import java.util.Scanner;

public class MaxOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array_l = new int[n];
        int[] array_r = new int[n];
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    array_l[i] = array[i][j];
                } else {
                    array_r[i] = array[i][j];
                }
            }
        }
        System.out.println(solve(array));
        /*System.out.println(Arrays.toString(array_l));
        System.out.println("next");
        System.out.println(Arrays.toString(array_r));*/
    }
        static int solve( int[][] x) {
            int last_R = -1;
            int ans = 0;
            Arrays.sort(x);


            return ans;
        }
}
/*
import java.util.Arrays;
        import java.util.Scanner;

public class code {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Baze[] list = new Baze[n];
        for (int i = 0; i < n; i++) {
            list[i] = new Baze(in.nextInt(), in.nextInt());
        }
        Arrays.sort(list);
        int result=0, t=0;
        for (int i = 0; i < n; i++) {
            if (list[i].l>=t) {
                result++;
                t=list[i].r;
            }
        }
        System.out.println(result);
    }

}

class Baze implements Comparable<Baze> {

    int l, r;

    public Baze(int l, int r) {
        this.l = l;
        this.r = r;
    }

    public int compareTo(Baze o) {
        if (this.r != o.r) {
            return this.r - o.r;
        } else {
            return o.l - this.l;
        }
    }
}
*/
