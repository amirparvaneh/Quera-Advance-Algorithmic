package Backtracking;

import java.util.Scanner;

public class Suduko{
    private static int[][] empties;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] elements = new int[9][9];
        int n = scanner.nextInt();
        for (int i = 0 ; i<9 ; i++){
            for (int j = 0 ; j<9; j++){
                elements[i][j] = scanner.nextInt();
                if (elements[i][j] == 0){
                    n++;
                }
            }
        }
    }
}
/*
import java.util.Scanner;

public class Main {
    private static int[][] empties;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] elements = new int[9][9];
        int emptyNumber = 0;
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                elements[i][j] = input.nextInt();
                if (elements[i][j] == 0)
                    emptyNumber++;
            }
        empties = new int[emptyNumber][2];
        {
            int counter = 0;
            for (int i = 0; i < 9; i++)
                for (int j = 0; j < 9; j++)
                    if (elements[i][j] == 0) {
                        empties[counter][0] = i;
                        empties[counter++][1] = j;
                    }
        }


        if (solve(0, 0, elements)) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++)
                    System.out.print(elements[i][j]+" ");
                System.out.println();
            }
        } else
            System.out.println("No solution exists");
    }

    private static boolean solve(int emptyIndex, int dontChoose, int[][] grid) {
        if (emptyIndex == empties.length) {
            return true;
        }
        int x = empties[emptyIndex][0];
        int y = empties[emptyIndex][1];
        boolean flag;
        for (int i = dontChoose + 1; i < 10; i++) {
            flag = true;
            for (int j = 0; j < 9; j++)
                if (grid[x][j] == i || grid[j][y] == i)
                    flag = false;
            if (flag) {
                if (checkInSquare(x, y, i, grid)) {
                    grid[x][y] = i;
                    return solve(++emptyIndex, 0, grid);
                }
            }
        }
        if (--emptyIndex == -1)
            return false;
        else {
            int lastX = empties[emptyIndex][0];
            int lastY = empties[emptyIndex][1];
            int undo = grid[lastX][lastY];
            grid[lastX][lastY] = 0;
            return solve(emptyIndex, undo, grid);
        }
    }

    private static boolean checkInSquare(int i, int j, int x, int[][] grid) {
        if (i > 5) {
            for (int m = 6; m < 9; m++)
                if (j > 5) {
                    for (int n = 6; n < 9; n++)
                        if (grid[m][n] == x)
                            return false;
                } else if (j > 2) {
                    for (int n = 3; n < 6; n++)
                        if (grid[m][n] == x)
                            return false;
                } else {
                    for (int n = 0; n < 3; n++)
                        if (grid[m][n] == x)
                            return false;
                }
        } else if (i > 2) {
            for (int m = 3; m < 6; m++)
                if (j > 5) {
                    for (int n = 6; n < 9; n++)
                        if (grid[m][n] == x)
                            return false;
                } else if (j > 2) {
                    for (int n = 3; n < 6; n++)
                        if (grid[m][n] == x)
                            return false;
                } else {
                    for (int n = 0; n < 3; n++)
                        if (grid[m][n] == x)
                            return false;
                }
        } else {
            for (int m = 0; m < 3; m++)
                if (j > 5) {
                    for (int n = 6; n < 9; n++)
                        if (grid[m][n] == x)
                            return false;
                } else if (j > 2) {
                    for (int n = 3; n < 6; n++)
                        if (grid[m][n] == x)
                            return false;
                } else {
                    for (int n = 0; n < 3; n++)
                        if (grid[m][n] == x)
                            return false;
                }
        }
        return true;
    }
}
*/
