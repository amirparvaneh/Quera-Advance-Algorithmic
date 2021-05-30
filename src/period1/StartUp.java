package period1;

public class StartUp {
}
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            input.add(sc.nextInt());
        }
        solve(input);
    }

    private static void solve(List<Integer> input) {
        int[] eat = {0, 0, 0, 0};
        int playerIndex = 0;
        while (!beZero(input)) {
            eat[playerIndex] += 1;
            int coc = input.get(playerIndex) - 1;
            input.set(playerIndex, coc);
            playerIndex = (++playerIndex) % 4;
            int tmp = input.remove(0);
            input.add(tmp);
        }
        for (int i = 0; i < eat.length; i++) {            System.out.print(eat[i] + " ");
        }
    }

    private static boolean beZero(List<Integer> input) {
        for (int in : input) {
            if (in == 0) {
                return true;
            }
        }
        return false;
    }
}*/
